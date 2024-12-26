
public class Ebook extends  Book{

    public Ebook(String bookId, String title, String author, Integer pubYear, String genre) {
        super(bookId, title, author, pubYear, genre);
    }

    @Override
    public String toString() {
        return "Ebook Type"+super.toString();
    }
}
