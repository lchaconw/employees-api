# Employee Management Backend

A Spring Boot backend application for managing employee data.

## Prerequisites
- Java 11
- Maven
- MySQL

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/lchaconw/employees-api
cd employees-api
```

### 2. Set Up the Database

Ensure that you have MySQL running and a database set up for the application.

```bash

Update the `application.properties` (or `application.yml`) file with your database connection details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=your-username
spring.datasource.password=your-password
```

You don´t need to create the tables, the application will create them for you.

### 3. Build the Project

Use Maven to build the project:

```bash
mvn clean install
```

### 4. Run the Application

Once the build completes, you can run the application using:

```bash
mvn spring-boot:run
```

Alternatively, built a JAR file:

```bash
java -jar target/employees-0.0.1-SNAPSHOT.jar
```

### 5. Access the Application

By default, the application starts on port `8080`. Access the APIs at: `http://localhost:8080`

## API Endpoints

- **List Employees**: `GET /api/employees`
- **Get Employee Details**: `GET /api/employees/{id}`
- **Insert Employee**: `POST /api/employees`
- **Edit Employee**: `PUT /api/employees/{id}`

## Testing

There are tests in JUNIT 5 and Mockito. To run the tests, run the following command:

```bash
mvn test
```

