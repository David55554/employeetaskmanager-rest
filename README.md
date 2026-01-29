# Employee Task Manager REST API

## What This Does
This project manages employees and tasks. We converted the command line app from project 2 into a REST API using Spring Boot.

## What We Used
Spring Boot, Spring Data JPA, H2 Database, Swagger, and Maven.

## The Entities

Employee has id, name, email, department, and salary.

Task has id, taskName, employeeId, deadline, priority, and status.

## How to Run
Open the project in IntelliJ. Run EmployeeTaskManagerRestApplication. Go to http://localhost:8080/swagger-ui.html in your browser.

## Endpoints

### Employee
You can create employees, get them by id, count them, get a sorted list, find by department, update them, and delete them.

### Task
You can create tasks, get them by id, count them, get them sorted, find by employee, find by status, update them, and delete them.

## Testing
We tested everything using Swagger. Just open the Swagger page and try the different endpoints.

## Main Changes
We replaced the CLI with REST controllers. Now you use HTTP requests instead of typing commands.