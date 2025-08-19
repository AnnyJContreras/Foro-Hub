package com.example.foro_Alura.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface topicoRepository extends JpaRepository<topico, Long> {

    // Buscar tópicos por título (ejemplo de query derivada)
    List<topico> findByTituloContainingIgnoreCase(String titulo);

    // Buscar tópicos por curso
    List<topico> findByCursoNombre(String nombreCurso);
}
