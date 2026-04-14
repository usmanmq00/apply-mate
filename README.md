# Apply Mate

## Annotations
### @RestController
@RestController in Spring Boot is used to create APIs that return data (like JSON) instead of web pages.
It combines @Controller + @ResponseBody, so whatever you return goes directly in the HTTP response.
In short: it makes your class act like a backend API endpoint provider.

### @Controller
@Controller in Spring Framework is used to create web controllers that return views (HTML pages).
It handles user requests and usually returns a page name (not JSON).
In short: it’s for frontend (UI) responses, unlike @RestController which returns data.

### @ResponseBody
@ResponseBody in Spring Boot is used to send the method’s return value directly as HTTP response (usually JSON).
It tells Spring: “don’t return a view/page, return data instead.”
In short: it converts your return object → API response.

### @RequestBody
@RequestBody in Spring Boot is used to read JSON data from the request and convert it into a Java object.
It maps the incoming request body to your method parameter automatically.
In short: it lets your API accept data from client (POST/PUT requests).

### @RequestMapping
@RequestMapping in Spring Boot is used to map a URL to a controller or method.
It defines which request path and HTTP method (GET, POST, etc.) should trigger your code.
In short: it connects a URL → your API method.

### HTTP Annotations
In Spring Boot, there are shortcut annotations for different HTTP methods:
#### @GetMapping
@GetMapping → used to fetch data (GET request)
#### @PostMapping
@PostMapping → used to create data (POST request)
#### @PutMapping
@PutMapping → used to update full data (PUT request)
#### @PatchMapping
@PatchMapping → used to update partial data (PATCH request)
#### @DeleteMapping
@DeleteMapping → used to delete data (DELETE request)

In short: each annotation maps a specific HTTP action to your method.

### @Service
@Service in Spring Framework is used to define the business logic layer of your application.
It tells Spring this class will handle processing, calculations, or rules.
In short: it sits between Controller and Repository and contains your core logic.

### @PathVariable
@PathVariable in Spring Boot is used to take a value directly from the URL.
It matches the value in {} and sends it to your method.
In short: it gets data from the URL path (like /user/10 → 10).

## Programming and Spring Concepts
### Loose Coupling
Loose Coupling means different parts of your code depend as little as possible on each other.
Changes in one class don’t break others easily. 
In Spring Framework, this is achieved using interfaces + dependency injection.

### Dependency Injection
Dependency Injection (DI) in Spring Framework means giving a class the objects it needs from outside, instead of creating them inside.
Spring automatically provides (injects) these dependencies at runtime.
In short: it helps achieve loose coupling and cleaner code

### Constructor Injection
Constructor Injection in Spring Framework means passing dependencies through a class constructor instead of creating them inside.
Spring automatically injects required objects when the class is created.
In short: it’s the recommended way of Dependency Injection (more safe and testable).

### Entity
Entity in JPA is a Java class that represents a database table.
Each object of that class represents a row in the table.
In short: class = table, object = row.

### ResponseEntity class -> For consistent and customizable response across all apis
ResponseEntity in Spring Framework is used to send a full HTTP response (body + status code + headers).
It gives you control over what to return (like 200 OK, 404 Not Found).
In short: it helps you send custom API responses with status.   // 

### HttpStatus enum
HttpStatus in Spring Framework is an enum that contains standard HTTP status codes (like 200, 404, 500).
It is used with ResponseEntity to set the response status.
In short: it represents API response status

## JPA
### What is JPA
JPA (Java Persistence API) in Java Persistence API is used to save and fetch data from database using Java objects instead of SQL.
It maps your classes to database tables automatically.
In short: it lets you work with Java objects instead of writing SQL queries.
JPA allows to convert objects to relational tables.
It like a specification. JPA makes querying easier and allows to save and updates objects without DML.
In built in Spring Boot and just needed a dependency to integrate.

### Application Layers
In Spring Boot, apps are divided into layers:
#### Presentation Layer
Presentation Layer (Controller) → handles user requests and sends responses (API/UI)
#### Service Layer
Service Layer → contains business logic (processing, rules)
#### Data Access Layer
Data Access Layer (Repository/DAO) → interacts with database

Controller → Service → Database (Repository/DAO).

### Data Access Layer
JPA Repository interface provides all common operation like CRUD for a data driven application.
We can also add special cases according to our needs.
Interface needs entity name and primary key type. 

### H2 Database
H2 Database is a lightweight database mostly used for testing and development.
It runs in memory (no setup needed) and starts quickly.
A temporary, fast database used for testing apps.
H2 database is an Java based open-source relational database API. So, works fast for Java based application.
H2 database runs in same jvm with your app called embedded mode.
It runs on its own sever and accepts request from client over the network called server mode.
It has browser based console app, to see tables and data.

### H2 Database Configuration
Add Spring Data JPA Dependency -> Persist data in database using Spring Data and Hibernate. Also allows you to define entities and repositories.

Add H2 Database Dependency

Add Dependencies in pom.xml if maven selected and reload Maven projects/dependencies. Else for gradle, add in build.gradle file.

Add Database configuration in application.properties file -> Specify Data source url and tell spring boot to enable h2 console.

## Java Concepts
### Iterator
An Iterator helps you go through a list safely and remove elements without errors unlike for-each which gives error.
It creates a cursor that moves through each item in the list one by one.
Because the for-each loop internally uses an iterator, and when you modify (remove/add) the list directly, the iterator detects a mismatch.
We need a loop with Iterator to traverse all elements safely and perform actions like remove while iterating.

## Project Learnings
### Taking control generating id from end user to yourself
Create a class variable with value and increment it before adding new object.

### Removal in for-each loop
for-each loop internally uses an iterator, and when you modify (remove/add) the list directly, the iterator detects a mismatch.
This cause errors.

### Add Dependencies in your app
If you need any dependency, go to start.spring.io and select dependency with your build tool maven or gradle. Copy the dependency from in explore.