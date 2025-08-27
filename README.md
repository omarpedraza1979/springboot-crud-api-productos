
# 🚀 Spring Boot REST API - Products Service

API REST en Spring Boot que implementa la operación GET de productos en memoria.
La fuente de datos puede configurarse dinámicamente desde application.properties para usar:

- Una lista en memoria (List<Product>)
- Un archivo JSON (products.json)

Ejemplo de configuración :

# application.properties
service.products=list       # Usa lista en memoria
# service.products=json     # Usa archivo JSON


## 📌 Características
- ✅ GET de productos sobre lista JSON en memoria (archivo JSON ó List<Product>)  
- ✅ API REST construida con Spring Boot.

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

# Clonar repositorio
git clone https://github.com/omarpedraza1979/springboot-crud-api-productos
cd springboot-crud-api-productos\cursoSprintBoot_v2>

# Compilar y ejecutar
mvn spring-boot:run


#  El proyecto quedará disponible en:  

http://localhost:8080

---

## 📌 Endpoints principales

| Método | Endpoint                              | Descripción                        |
|--------|---------------------------------------|------------------------------------|
| GET    | `/sistema/api/v1/productos`           | Listar todos los productos         |


---
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
