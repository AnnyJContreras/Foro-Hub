package com.example.foro_Alura.domain.respuesta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    // Buscar respuestas por ID de tópico
    List<Respuesta> findByTopicoId(Long topicoId);

    // Buscar respuestas marcadas como solución
    List<Respuesta> findByTopicoIdAndSolucionTrue(Long topicoId);
}
