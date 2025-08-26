
# 📌 API REST PRODUCTOS:

API REST en **Spring Boot** que implementa operación GET de productos en memoria. La lista puede cambiarse por parametro en el archivo 
de configuracion **application.properties** para que sea tomada desde un archivo de recursos en formato JSON o desde una **List<Product>** 

Este proyecto utiliza la anotación **@ConditionalOnProperty** para manejar dos tipos de listas de productos contenidas en: 
- \cursoSprintBoot_v2\service\ProducserviceImpl.java
- \cursoSprintBoot_v2\src\main\resources\products.json

El objetivo es poder utilizar una lista u otra solo cambiando la propiedad **service.products=list** del archivo **application.propertie**

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


### 🔹 Pasos

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

```
---
## 🧪 Pruebas
```bash
mvn test
```

---
## 🧪 Postman
Este proyecto incluye una colección de Postman para probar los endpoints de la API. 
[SpringBootProducts_V2.postman_collection.json](./SpringBootProducts_V2.postman_collection.json)


## 👨‍💻 Autor
- **Omar Orlando Pedraza Garzón**
- [GitHub](https://github.com/omarpedraza1979)
---

