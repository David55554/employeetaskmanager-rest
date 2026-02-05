Docker Deployment

This application is containerized using Docker.

Running with Docker

Pull the image from Docker Hub:

docker pull YOUR-david11577/employeetaskmanager-rest:1.0


Run the container:

docker run -d -p 8080:8080 --name employee-api YOUR-david11577/employeetaskmanager-rest:1.0


Access the API at http://localhost:8080/swagger-ui.html

Building Locally

Build the JAR file:

./mvnw clean package -DskipTests


Build the Docker image:

docker build -t employeetaskmanager-rest:1.0 .


Run the container:

docker run -d -p 8080:8080 --name employee-api employeetaskmanager-rest:1.0
