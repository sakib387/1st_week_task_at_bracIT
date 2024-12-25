public class Ebook extends  Book{
    public Ebook(String title, String author, String genre, String isbn) {
        super(title, author, genre, isbn);
    }

    @Override
    public String toString() {
        return "Ebook Type"+super.toString();
    }
}
