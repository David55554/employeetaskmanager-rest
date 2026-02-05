Spring Boot REST API Plan

Goal
we turned the Employee Task Manager from a command line app into a REST API.

How We Organized the Code

We used a layered architecture with four layers:

Model Layer - This has our Employee and Task classes.

Repository Layer - This talks to the database.

Service Layer - This has the business rules and validation.

Controller Layer - This has the REST endpoints.

Steps We Followed

Step 1: Project Setup
We created a new Spring Boot project using Spring Initializr. We added the dependencies we needed which were Spring Web, Spring Data JPA, H2 Database, and Swagger. Then we configured the application.properties file with the database settings.

Step 2: Creating the Entities
We made the Employee and Task classes and added JPA annotations like @Entity, @Id, and @GeneratedValue so they work with the database.

Step 3: Making the Repositories
We created EmployeeRepository and TaskRepository. Both extend JpaRepository which gives us basic CRUD operations. We also added some custom query methods for sorting and filtering.

 Step 4: Building the Services
We created EmployeeService and TaskService. These have all the business logic and validation rules. For example, checking that emails are valid and salaries are not negative.

 Step 5: Creating the Controllers
We made EmployeeController and TaskController. These are the REST endpoints. We mapped HTTP methods to operations so POST creates, GET reads, PUT updates, and DELETE deletes.

 Dependency Injection
We used Spring's dependency injection with @Autowired. Controllers get the services injected, and services get the repositories injected. Spring manages everything automatically so we don't use the new keyword.
 
Required Operations for Each Entity
Both Employee and Task needed these operations:
a.Create using POST
b.Get by ID using GET
c.Count total using GET
d.Get sorted list using GET
e.Get by filter using GET
f.Update using PUT
g.Delete using DELETE

AI Assistance Used
We used Claude.ai as a learning tool and debugging helper throughout this project. 
For the controller layer, Claude helped us write the HTTP request handling logic and understand how to structure endpoint methods properly. 
When working on the service layer, we used Claude to see validation pattern examples and understand exception handling. 
Claude also helped us debug issues with package structures, Maven dependencies, and HTTP response codes. 
We learned about Spring annotations and dependency injection by asking Claude for explanations and examples that we then adapted for our project.