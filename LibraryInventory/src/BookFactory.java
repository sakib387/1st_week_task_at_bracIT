
public class BookFactory {
    public    Book createBook( String type,String bookId,String title,String author,Integer pubYear,String genre){
        if(type=="ebook")return new Ebook(bookId, title,  author,  pubYear,  genre);
        else if(type=="audiobook") return  new AudioBook(bookId, title,  author,  pubYear,  genre);
        else  return new  Book(bookId, title,  author,  pubYear,  genre);
    }
}
