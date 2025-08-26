# Web Lab - Spring Boot

We will learn about developing and testing web services using the Spring Boot framework. We will create an API for user registration, where users can register by providing a username and email. We will cover the development of the service using separate controller and application classes.

**Student Task**: The task is to develop a Web Service API for user registration using Spring Boot. In this exercise, students are required to complete the code by implementing the missing parts. The API should allow users to register by providing a username, display name, and email. Once the students finish writing the code, the API should be able to handle registration requests and store the registered users.

**User Model**

Complete the code in the `User` class to define the user model. The user model should have the following attributes:

* username: a unique identifier for the user
* displayname: the user's first and last name
* email: the user's email address

**User Controller**

Use a HashMap to store registered users. Define a static HashMap in the `UserController` class to store the registered users. The key of the HashMap should be the username, and the value should be the user object. Complete the code in the `UserController` class to implement the following functions:

* `POST /users` registerUser: This function should register a new user by adding the user to the HashMap. This function should be called by a `POST` request to receive the user’s JSON and return a `201 CREATED` status. If the username already exists, the function should return `409 CONFLICT`.
* `GET /users/{username}` getUser: This function should be called by a `GET` request to retrieve the JSON of the user with the given username, returning a `200 OK` status. If the user does not exist, the function should return `404 NOT FOUND`.
* `GET /users` list: This function should return a list of all registered users, with a `200 OK` status.

**Test the Service**

Students can run the Spring Boot application using the `App` class. Test these services using Postman. Students can use the following requests to test the service:

* Register a new user: Send a POST request to `http://localhost:8080/users` with the following JSON content:

```json
{
  "username": "john",
  "displayname": "John Doe",
  "email": "john@email.com"
}
```

* Retrieve user data: Send a GET request to `http://localhost:8080/users/{username}`, where `{username}` is the username of the user you want to retrieve.

* List all users: Send a GET request to `http://localhost:8080/users`

* Retrieve user data: Send a GET request to `http://localhost:8080/users/john`

**Unit Test**

Run the unit tests in the `UserControllerTest` class to test the service. Students can run the `maven verify` command or the following command:

```
mvn verify
```
