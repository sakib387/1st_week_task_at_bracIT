import java.util.List;

public class Library {
    private static  Library instance=null;
    private List<Book> books;
    private Library(){

    }
    public  static Library getLibraryInstance(){
        if(instance==null){
            instance=new Library();
        }
        return instance;
    }
}
