package com.example.foro_Alura.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "ForoHub API",
                version = "1.0",
                description = "API REST para gestionar foros, tópicos, respuestas y usuarios",
                contact = @Contact(
                        name = "Equipo Alura",
                        email = "soporte@alura.com"
                )
        ),
        servers = {
                @Server(url = "http://localhost:8080", description = "Servidor local")
        }
)
public class OpenApiConfig {
}

