package com.example.foro_Alura.domain.topico.dato;

import com.example.foro_Alura.domain.topico.StatusTopico;
import java.time.LocalDateTime;

public record DatosDetalleTopico(

        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        StatusTopico status,
        String nombreAutor,
        String nombreCurso
) {}

