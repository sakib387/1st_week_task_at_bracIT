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
  ### Work flow
![1](https://github.com/user-attachments/assets/92467b1a-7ea9-4dd3-92e0-f1cacf558a6f)
![2](https://github.com/user-attachments/assets/5091126f-7b7e-4a41-90c9-52d44d6ce084)
![3](https://github.com/user-attachments/assets/55160070-6666-4262-90dd-b20aaebf419d)
![4](https://github.com/user-attachments/assets/888fbe90-8511-4900-80ea-72e1e1b1bbda)
![5](https://github.com/user-attachments/assets/48c0a488-2ab6-4601-b572-072288e6f8a9)
![6](https://github.com/user-attachments/assets/09fc7c43-82af-43ef-8dad-8952ce5484d0)
![7](https://github.com/user-attachments/assets/b6da35e5-6e9d-4e0b-916c-8c86cf1a7745)
![8](https://github.com/user-attachments/assets/bbf532d6-e6b5-44e2-8e4a-8f8e00698f56)

 

