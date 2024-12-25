public class AudioBook extends  Book{
    public AudioBook(String title, String author, String genre, String isbn) {
        super(title, author, genre, isbn);
    }

    @Override
    public String toString() {
        return "AudioBook Type " + super.toString();
    }
}

