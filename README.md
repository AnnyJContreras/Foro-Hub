# ForoHub

ForoHub es un foro web con **Spring Boot** y **MySQL**, donde los usuarios pueden registrarse, crear tópicos y responder. Usa **JWT** para autenticación y Swagger para probar la API.

## Base de datos
- Nombre: `forohub`  
- Usuario: `foro_user`  
- Contraseña: `1234`

## Endpoints principales
- `POST /usuarios` → Registrar usuario  
- `POST /auth/login` → Iniciar sesión  
- `GET /topicos` → Listar tópicos  
- `POST /topicos` → Crear tópico  

## Ejecutar
1. Configurar MySQL.  
2. Abrir el proyecto en IntelliJ.  
3. Ejecutar `ForoAluraApplication.java`.  
4. Probar endpoints en [Swagger UI](http://localhost:8080/swagger-ui.html).  


Ejecutar ForoAluraApplication.java.

Probar endpoints en http://localhost:8080/swagger-ui.html.
