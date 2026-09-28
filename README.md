# Library Management System

A console-based Library Management System built with Core Java and Object-Oriented Programming concepts.

## Project Overview

This project is designed to manage basic library operations such as adding books, issuing books, returning books, and removing books.

It also demonstrates how students and librarians can be modeled using inheritance and method overriding.

## Features

- Add books to the library
- Display book details
- Issue a book
- Return a book
- Remove a book from the library
- Display student details
- Display librarian details
- Demonstrate inheritance
- Demonstrate method overriding
- Demonstrate runtime polymorphism
- Store books using ArrayList

## Technologies Used

- Java 21
- Maven
- IntelliJ IDEA
- Git
- GitHub

## OOP Concepts Used

### Class and Object

The project contains the following main classes:

- Book
- User
- Student
- Librarian
- Library
- LibraryOperations
- Main

Objects of these classes are created in the Main class.

### Encapsulation

Book data is managed inside the Book class. Book fields such as book ID, title, author, price, and availability are controlled through the class.

The Library class also manages its internal collection of books.

### Inheritance

Student and Librarian extend the User class.

Relationship:

User -> Student
User -> Librarian

### Polymorphism

Runtime polymorphism is demonstrated by using a User reference for Student and Librarian objects.

The displayUserDetails() method is overridden in both child classes.

### Abstraction

LibraryOperations is an interface that defines the main library operations.

The Library class implements this interface.

### Method Overriding

Student and Librarian override the displayUserDetails() method inherited from User.

### Constructors

Constructors are used to initialize Book, User, Student, Librarian, and Library objects.

### this Keyword

The this keyword is used to refer to the current object's instance variables.

### super Keyword

The super keyword is used by Student and Librarian constructors to call the User constructor.

### Collections

ArrayList is used in the Library class to store Book objects.

## Project Structure

LibraryManagementSystem
|
+-- src
|   +-- main
|   |   +-- java
|   |       +-- org.example
|   |           +-- Book.java
|   |           +-- User.java
|   |           +-- Student.java
|   |           +-- Librarian.java
|   |           +-- LibraryOperations.java
|   |           +-- Library.java
|   |           +-- Main.java
|   |
|   +-- test
|
+-- .gitignore
+-- pom.xml
+-- README.md

## Main Classes

### Book

Represents a book available in the library.

Book information includes:

- Book ID
- Title
- Author
- Price
- Availability

Main responsibilities:

- Display book information
- Issue a book
- Return a book

### User

Base class for library users.

Common information:

- User ID
- Name
- Email

### Student

Extends User and represents a student.

Additional information:

- Course

### Librarian

Extends User and represents a librarian.

Additional information:

- Employee ID

### LibraryOperations

Interface containing the main library operations:

- Add book
- Remove book
- Issue book
- Return book

### Library

Implements LibraryOperations and manages the library's collection of books.

### Main

The entry point of the application.

It creates the library, books, students, and librarian objects and demonstrates the implemented functionality.

## Basic Workflow

1. Create a Library object.
2. Create Book objects.
3. Add books to the library.
4. Display book details.
5. Issue a book.
6. The book availability changes to unavailable.
7. Return the book.
8. The book availability changes back to available.
9. Remove a book when it is no longer required.

## How to Run

### Prerequisites

Install the following:

- Java JDK 21
- IntelliJ IDEA
- Maven
- Git

### Run the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure Java 21.
4. Open Main.java.
5. Run the main() method.

## Purpose of the Project

This project was created to build practical understanding of:

- Core Java
- Classes and Objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Method Overriding
- this and super keywords
- Collections
- ArrayList
- Maven project structure

## Future Improvements

The current version is a console-based Core Java application.

Possible future improvements:

- Database integration
- User authentication
- Book search
- Borrowing and issue history
- Due dates and fine calculation
- Admin panel
- REST API
- Spring Boot backend
- Web-based interface

These features are not included in the current version.

## Author

Vishal

Java Developer / Java Full Stack Learner

## License

This project is created for learning and educational purposes.
