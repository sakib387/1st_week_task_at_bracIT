public class Book {
    private  String title;
    private String author;
    private String genre;
    private String bookId;
    private Integer pubYear;

    public Book(String bookId,String title, String author,Integer pubYear, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.pubYear=pubYear;
        this.genre = genre;

    }

    public void setPubYear(Integer pubYear) {
        this.pubYear = pubYear;
    }

    public Integer getPubYear() {
        return pubYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return genre;
    }

    public String getBookId() {
        return bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", bookId='" + bookId + '\'' +
                ", pubYear=" + pubYear +
                '}';
    }
}
