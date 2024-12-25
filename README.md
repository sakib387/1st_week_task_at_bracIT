# Library Inventory CLI

 
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
 

### Data Storage
- The application uses an `ArrayList` to store the library's inventory of books.
