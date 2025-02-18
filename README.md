#Blog Application

---
### Overall Architecture

![Screenshot 2025-02-18 at 00 48 51](https://github.com/user-attachments/assets/6c0dcabe-8586-4bfd-b419-7006ddfa7386)



### The service provides an API
![Screenshot 2025-02-18 at 00 49 30](https://github.com/user-attachments/assets/11e286dc-d662-44fe-a94d-0f8f3acf51f2)



## Technologies

---
- Java 23
- Spring Boot 3.0
- Spring Security 6
- Spring Data JPA
- H2 In Memory Database
- PostgreSql
- Restful API
- Maven  
- Docker
- Docker Compose
- Lombok
- Map Structure
- Adminer

## Prerequisites

---
- Maven or Docker
---

## Docker Run
 The `Dockerfile` has multistage build, so you do not need to build and run separately.

Please follow the below directions in order to build and run the application with Docker Compose;

```sh
$ cd blogapp
$ docker-compose up -d
```



---
## Maven Run
To build and run the application with `Maven`, please follow the directions below;

```sh
$ cd blogapp
$ mvn clean install
$ mvn spring-boot:run
```
##FrontEnd Run 
You can rich the ui on : http://localhost:5173/
```sh
$ cd blog-fe
$ npm install
$ npm run dev
```


---
