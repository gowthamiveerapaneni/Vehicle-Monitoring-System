# Vechile Monitoring System

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK] - Java™ Platform, Standard Edition 8 Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* [git](https://git-scm.com/) - Free and Open-Source distributed version control system

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.vehicles.springboot.VehiclesBackendApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Spring Boot Application.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## packages

- `model` — to hold our entities;
- `repository` — to communicate with the database;
- `service` — to hold our business logic;
- `controller` — to listen to the client;
- `configuration` — to build the conigurations needed for the application;

- `src/main/resources/` - Contains all the static resources, templates and property files.
- `src/main/resources/static` - contains static resources such as css, js and images.
- `src/main/resources/templates` - contains server-side templates which are rendered by Spring.
- `src/main/resources/application.properties` - It contains application-wide properties.

- `Dockerfile` - Build and Run this file to start docker version of app locally.
- `pom.xml` - contains all the project dependencies