# Library Inventory CLI

## Overview

The Library Inventory CLI is a command-line interface (CLI) application written in Java that allows users to manage a library inventory system. The project demonstrates the use of Object-Oriented Programming (OOP) principles and incorporates advanced concepts such as design patterns, collections framework, streams, and custom exceptions.

## Key Features

- **Add Books**: Add different types of books to the library inventory (e.g., Physical Books, E-Books, and Audio Books).
- **Remove Books**: Remove books from the inventory using their BookId.
- **Search Books**: Search for books by title, author, or category.
- **List All Books**: Display all books currently in the library inventory.

## Technologies and Concepts Used

### Programming Language
- Java

### OOP Concepts
- **Classes and Objects**
- **Inheritance and Polymorphism**
- **Encapsulation**

### Design Patterns
- **Singleton Pattern**: Ensures a single instance of the Library class for consistent inventory management.
- **Factory Design Pattern**: Simplifies and abstracts the creation of different types of Book objects.

### Collections Framework
- Used `ArrayList` to store and manage the list of books.

### Java Streams
- Utilized for searching and listing books efficiently.

### Custom Exceptions (Optional Enhancements)
- Handle invalid input or actions gracefully.

## Project Structure

### Classes
- **Book (Base Class)**: Represents a generic book with attributes like title, author, category, and bookid.
- **EBook (Subclass)**: Represents an electronic book.
- **AudioBook (Subclass)**: Represents an audiobook.
- **Library**: Singleton class that acts as the central inventory manager. It holds the list of books and provides methods to add, remove, search, and list books.
- **BookFactory**: Implements the Factory Design Pattern to create different types of books based on user input.
- **LibraryInventoryCLI**: Main class that provides the CLI interface for user interaction.

## How It Works

### User Interaction
- Users interact with the application through a text-based menu.
- Each menu option triggers specific operations on the library inventory.

### Singleton Library
- The `Library` class ensures that all operations are performed on a single instance of the library.

### Dynamic Book Creation
- The `BookFactory` dynamically creates `Book` objects based on the type specified by the user.

### Data Storage
- The application uses an `ArrayList` to store the library's inventory of books.
