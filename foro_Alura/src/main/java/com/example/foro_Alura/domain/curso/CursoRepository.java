package com.example.foro_Alura.domain.curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    // Buscar curso por nombre
    Optional<Curso> findByNombre(String nombre);
}
