# LibraryApp

## Descripción
LibraryApp es una API que maneja una biblioteca de libros. Está desarrollada utilizando Java, Spring Boot y MySQL. Actualmente, el proyecto está en desarrollo y los controladores aún no están implementados.

## Características
- Gestión de libros en una base de datos.
- CRUD (Crear, Leer, Actualizar, Eliminar) de libros.
- Integración con MySQL para el almacenamiento de datos.
- Seguridad básica integrada con Spring Security.

## Tecnologías Utilizadas
- Java 17
- Spring Boot 3.3.1
- MySQL
- Maven
- Lombok

## Instalación
### Prerrequisitos
- Java 17 o superior
- Maven
- MySQL

### Pasos de Instalación
1. Clona el repositorio:
    ```bash
    git clone https://github.com/GuilleQuinteros/LibraryApp.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd LibraryApp
    ```
3. Configura la base de datos MySQL:
    - Crea una base de datos llamada `biblioteca`.
    - Actualiza las credenciales de la base de datos en el archivo `src/main/resources/application.properties`:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
        spring.datasource.username=tu_usuario
        spring.datasource.password=tu_contraseña
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        ```
4. Compila y ejecuta la aplicación:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Uso
1. La API estará disponible en `http://localhost:8080`.
2. Puedes realizar operaciones CRUD sobre los libros utilizando herramientas como Postman o cURL.

## Contribuir
1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-feature`).
3. Realiza tus cambios y commitea (`git commit -am 'Agrega nueva feature'`).
4. Envía tus cambios (`git push origin feature/nueva-feature`).
5. Crea un nuevo Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT.

## Contacto
Si tienes alguna pregunta o sugerencia, no dudes en ponerte en contacto conmigo a través de [mi perfil de GitHub](https://github.com/GuilleQuinteros).
