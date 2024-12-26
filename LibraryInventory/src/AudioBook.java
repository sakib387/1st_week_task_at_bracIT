
public class AudioBook extends  Book{
    public AudioBook(String bookId, String title, String author, Integer pubYear, String genre) {
        super(bookId, title, author, pubYear, genre);
    }



    @Override
    public String toString() {
        return "AudioBook Type " + super.toString();
    }
}

