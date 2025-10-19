## Form-Based Authentication System 🔐
A basic Spring Boot application implementing form-based authentication with login and logout functionality.
## Project Overview
This project demonstrates fundamental authentication concepts in Spring Boot:

Login Form - Username/password authentication
In-Memory User - Demo user for testing
Session Management - Basic Spring Security session handling
Protected Routes - Welcome page requires authentication
Logout Functionality - Secure user logout
Simple UI - HTML/CSS frontend with Thymeleaf templates


## Tech Stack
ComponentTechnologyBackendSpring Boot 3.2.0SecuritySpring Security 6Template EngineThymeleafBuild ToolMavenJava Version17+

## Project Structure
Form-based-auth/
├── src/main/java/com/example2/Form_based_auth/
│   ├── controller/
│   │   └── LoginController.java      (Login & welcome endpoints)
│   ├── config/
│   │   └── SpringSecurityConfig.java (Security configuration)
│   └── FormBasedAuthApplication.java (Main application)
│
├── src/main/resources/
│   ├── templates/
│   │   ├── login.html               (Login page)
│   │   └── welcome.html             (Protected page after login)
│   ├── static/
│   │   └── style.css                (Styling)
│   └── application.properties       (Configuration)
│
├── pom.xml                          (Maven dependencies)
└── README.md

## Getting Started
Prerequisites

Java 17 or higher
Maven 3.6+
IDE (IntelliJ IDEA, Eclipse, or VS Code)

Installation Steps
1. Clone the Repository
bashgit clone https://github.com/yourusername/Form-based-auth.git
cd Form-based-auth
2. Install Dependencies
bashmvn clean install
3. Run the Application
bashmvn spring-boot:run
The application will start at: http://localhost:8080

## Endpoints
MethodEndpointDescriptionGET/loginLogin pagePOST/loginProcess loginGET/welcomeProtected welcome page (requires login)GET/logoutLogout user

## Demo Credentials

Username: user
Password: pass


🔐 Security Features (Current)

Basic form-based authentication
In-memory user storage
Session management
CSRF protection
Unauthorized access redirection


📝 License
This project is open source and available under the MIT License.
