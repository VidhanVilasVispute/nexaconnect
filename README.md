# Smart Contact Manager (SCM)

## Introduction

Smart Contact Manager (SCM) is a web-based application that allows users to manage their contacts efficiently. It includes features like user authentication, contact management, email integration, and data export functionalities. The project follows modern web development best practices using **Spring Boot, MySQL/, OAuth, and Cloudinary for cloud storage**.

## Features

1. **User Authentication & Authorization:**
   - User signup with email and password.
   - Email verification link for account activation.
   - Social login with Google and GitHub (OAuth).
2. **Contact Management:**
   - Add, update, delete contacts with a profile picture.
   - Upload contact images to **Cloudinary**.
   - Search, favorite, and paginate contacts.
3. **Email Functionality:**
   - Send emails directly from SCM.
   - Emails can contain **text and attachments**.
4. **User Profile & Preferences:**
   - View and edit profile details.
   - Toggle between **Dark and Light themes**.
   - Provide feedback.
5. **Data Export & Reports:**
   - Export contact details to **Excel/PDF**.
6. **Security & Performance:**
   - **Spring Security** for route protection.
   - **Spring Data JPA** for database management.
   - Validation mechanisms to ensure data integrity.

## Technologies Used

1. **Backend:**
   - Spring Boot (Latest Version)
   - Spring Framework & Spring MVC
   - Spring Security (Authentication & Authorization)
   - Spring Data JPA (Database ORM)
   - Java Email API (Email Integration)
   - OAuth (Google & GitHub Login)
2. **Frontend:**
   - Thymeleaf / (Template Engine)
   - JavaScript
   - Tailwind CSS & Flowbite Components (UI Design)
3. **Database:**
   - MySQL 
4. **Cloud & External Services:**
   -  Cloudinary (File Storage)
   - Excel tools (Data Export)

## Setup Instructions

### Prerequisites

- Java **21**
- Maven **3+**
- MySQL Database
- AWS Account (for image storage)

### Installation Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/smart-contact-manager.git
   cd smart-contact-manager
   ```
2. **Configure Database:**
   - Update `application.properties` with your database credentials.
3. **Install Dependencies & Build Project:**
   ```bash
   mvn clean install
   ```
4. **Run the Application:**
   ```bash
   mvn spring-boot:run
   ```
5. **Access the Application:**
   - Open `http://localhost:808`1 in your browser.

## Future Enhancements

- Multi-language support
- AI-powered contact suggestions
- Two-factor authentication (2FA)

##

##

