package com.example.foro_Alura.domain.usuario;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario implements UserDetails{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;


        @Column(unique = true, nullable = false)
        private String email;


        private String password;

        @Builder.Default
        private boolean activo = true;

        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "usuarios_perfiles",
                joinColumns = @JoinColumn(name = "usuario_id"),
                inverseJoinColumns = @JoinColumn(name = "perfil_id"))
        private Set<Perfil> perfiles;

        @Override public Collection<? extends GrantedAuthority> getAuthorities() {
            if (perfiles == null) return List.of();
            return perfiles.stream()
                    .map(p -> new SimpleGrantedAuthority(p.getNombre()))
                    .collect(Collectors.toSet());
        }
        @Override public String getUsername() { return email; }
        @Override public boolean isAccountNonExpired() { return true; }
        @Override public boolean isAccountNonLocked() { return true; }
        @Override public boolean isCredentialsNonExpired() { return true; }
        @Override public boolean isEnabled() { return activo; }

}
