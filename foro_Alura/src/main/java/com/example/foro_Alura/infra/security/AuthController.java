package com.example.foro_Alura.infra.security;

import com.example.foro_Alura.domain.usuario.dato.DatosAutenticacionUsuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid DatosAutenticacionUsuario datos) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(datos.email(), datos.password())
        );

        String tokenJWT = tokenService.generarToken(authentication);

        return ResponseEntity.ok(tokenJWT);
    }
}
