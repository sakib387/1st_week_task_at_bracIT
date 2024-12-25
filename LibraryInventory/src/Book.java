public class Book {
    private  String title;
    private String author;
    private String genre;
    private String isbn;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
