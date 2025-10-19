Form-Based Authentication System
A basic Spring Boot application implementing form-based authentication with login and logout functionality.
Project Overview
This project demonstrates fundamental authentication concepts in Spring Boot:

Login Form - Username/password authentication
In-Memory User - Demo user for testing
Session Management - Basic Spring Security session handling
Protected Routes - Welcome page requires authentication
Logout Functionality - Secure user logout
Simple UI - HTML/CSS frontend with Thymeleaf templates

Tech Stack

Backend: Spring Boot 3.2.0
Security: Spring Security 6
Template Engine: Thymeleaf
Build Tool: Maven
Java Version: 17+

Project Structure
Form-based-auth/
├── src/main/java/com/example2/Form_based_auth/
│   ├── controller/
│   │   └── LoginController.java
│   ├── config/
│   │   └── SpringSecurityConfig.java
│   └── FormBasedAuthApplication.java
│
├── src/main/resources/
│   ├── templates/
│   │   ├── login.html
│   │   └── welcome.html
│   ├── static/
│   │   └── style.css
│   └── application.properties
│
├── pom.xml
└── README.md
Getting Started
Prerequisites

Java 17 or higher
Maven 3.6+
IDE (IntelliJ IDEA, Eclipse, or VS Code)

Installation Steps

Clone the Repository

bashgit clone https://github.com/yourusername/Form-based-auth.git
cd Form-based-auth

Install Dependencies

bashmvn clean install

Run the Application

bashmvn spring-boot:run
The application will start at: http://localhost:8080
Endpoints

GET /login - Login page
POST /login - Process login
GET /welcome - Protected welcome page (requires login)
GET /logout - Logout user

Demo Credentials

Username: user
Password: pass

Security Features

Basic form-based authentication
In-memory user storage
Session management
CSRF protection
Unauthorized access redirection

License
This project is open source and available under the MIT License.
Happy Coding!
