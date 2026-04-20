
Sistema de Gestión de Estudiantes

Descripción

Aplicación web desarrollada con **Spring Boot** que implementa un sistema CRUD para la gestión de estudiantes, utilizando **JPA/Hibernate** para persistencia en base de datos MySQL y **Thymeleaf** como motor de vistas bajo el patrón **MVC**.

---
 Tecnologías utilizadas

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* MySQL
* Thymeleaf
* Maven

---

Arquitectura

El sistema está organizado en capas siguiendo el patrón MVC:

```text
controller → maneja las peticiones HTTP
service → lógica de negocio
repository → acceso a datos (JPA)
model → entidad persistente
```

---

Estructura del proyecto

```text
src/main/java/com/universidad/estudiantes/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── EstudiantesApplication.java
```

---

## ⚙️ Configuración de base de datos

Crear base de datos en MySQL:

```sql
CREATE DATABASE estudiantes_db;
```

Configurar en `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/estudiantes_db
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

Ejecución

```bash
mvn clean install
mvn spring-boot:run
```

Abrir en navegador:

```text
http://localhost:8080/estudiantes
```

---

 Funcionalidades

* Listar estudiantes
* Crear nuevo estudiante
* Editar estudiante
* Eliminar estudiante
* Validación de datos (Bean Validation)

---
<img width="1430" height="921" alt="image" src="https://github.com/user-attachments/assets/eee46339-d31c-4e2e-9280-8575700d5c75" />
 Validación

El sistema cumple con:

* Persistencia real en MySQL
* Uso de JPA/Hibernate
* Arquitectura en capas
* CRUD completo funcional
* Validaciones en formulario

---


