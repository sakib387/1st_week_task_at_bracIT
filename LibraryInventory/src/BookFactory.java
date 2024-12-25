public class BookFactory {
    public    Book createBook(String type,String title,String author,String genere,String isbn){
        if(type=="ebook")return new Ebook(title,author,genere,isbn);
        else if(type=="audiobook") return  new AudioBook(title,author,genere,isbn);
        else  return new  Book(title,author,genere,isbn);
    }
}
