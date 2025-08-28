
# 🚀 Spring Boot REST API - Products Service

API REST en Spring Boot que implementa la operación GET de productos en memoria.
La fuente de datos puede configurarse dinámicamente desde application.properties para usar:

- Una lista en memoria (List<Product>)
- Un archivo JSON (products.json)


## 📌 Características
- ✅ GET de productos desde lista JSON en memoria (archivo JSON ó List<Product>), 
     usando `@ConditionalOnProperty` para seleccionar la fuente de datos.

- ✅ API REST construida con Spring Boot.

---

## ⚙️ Configuración dinámica de productos

Este proyecto usa la anotación 
`@ConditionalOnProperty(name = "service.products", havingValue = "json")`  
para decidir la fuente de datos de productos:

- `service.products=list` → Usa una lista en memoria (List<Product>)
- `service.products=json` → Carga desde un archivo `products.json`

---
## 🛠️ Tecnologías utilizadas
- **Java 17** → Lenguaje principal  
- **Spring Boot 3.3.7** → Framework  
- **Maven** → Gestión de dependencias  
- **Postman** → Pruebas de endpoints
- **IntelliJ IDEA** → IDE Desarrollo

---

## 📂 Estructura del proyecto
```bash

    ├───src
    │   ├───main
    │   │   ├───java
    │   │   │   └───cursoSprintBoot_v2
    │   │   │       ├───configuration
    │   │   │       ├───controllers
    │   │   │       ├───domain
    │   │   │       └───service
    │   │   └───resources
    │   └───test
    │       └───java
    │           └───cursoSprintBoot_v2


```
---

## ⚙️ Instalación y ejecución
### 🔹 Requisitos previos

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)


## 🔹 Pasos

1. Clonar repositorio
git clone https://github.com/omarpedraza1979/springboot-crud-api-productos

2. Compilar y ejecutar
 ..springboot-crud-api-productos\cursoSprintBoot_v2> mvn spring-boot:run

3. El proyecto quedará disponible en:  
http://localhost:8080

---

## 📌 Endpoints principales

| Método | Endpoint                              | Descripción                        |
|--------|---------------------------------------|------------------------------------|
| GET    | `/sistema/api/v1/productos`           | Listar todos los productos         |


## 🧪 Ejemplo con CURL

**1. Listar todos los productos**

curl http://localhost:8080/sistema/api/v1/productos


## 🧪 Postman
Este proyecto incluye una colección de Postman para probar los endpoints de la API. 
[SpringBootProducts_V2.postman_collection.json](./SpringBootProducts_V2.postman_collection.json)

---
## 🧪 Pruebas
```bash
mvn test
```
---

## 👨‍💻 Autor
- **Omar Orlando Pedraza Garzón**
- [GitHub](https://github.com/omarpedraza1979)
---


## 📜 Licencia
Este proyecto está bajo la licencia [MIT](LICENSE).  
Eres libre de usarlo, modificarlo y distribuirlo con fines personales o educativos.
