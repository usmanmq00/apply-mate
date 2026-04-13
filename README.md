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



### ResponseEntity class -> For consistent and customizable response across all apis
ResponseEntity in Spring Framework is used to send a full HTTP response (body + status code + headers).
It gives you control over what to return (like 200 OK, 404 Not Found).
In short: it helps you send custom API responses with status.   // 

### HttpStatus enum
HttpStatus in Spring Framework is an enum that contains standard HTTP status codes (like 200, 404, 500).
It is used with ResponseEntity to set the response status.
In short: it represents API response status

## Project Learnings
### Taking control generating id from end user to yourself
Create a class variable with value and increment it before adding new object.