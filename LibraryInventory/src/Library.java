import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    private static  Library instance=null;
    private List<Book> books;
    private Library(){
           books=new ArrayList<>();
    }
    public  static Library getLibraryInstance(){
        if(instance==null){
            instance=new Library();
        }
        return instance;
    }

    public void addBooks( Book  book ) throws AlreadyExistException{
        Book exitsbook=this.books.stream().filter(b->b.getBookId().equals(book.getBookId())).findFirst().orElse(null);
        if(exitsbook!=null){

            throw new AlreadyExistException("Already exist a book with this book id pls try new Id ");
        }
        this.books.add(book);
        System.out.println("Book added successfully..") ;

    }

    public void update(String Id) throws BookNotFoundException {


        Book book = this.books.stream()
                .filter(b -> b.getBookId().equals(Id))
                .findFirst()
                .orElse(null);

        if (book == null) {
            throw new BookNotFoundException("No book found with the given Id: " + Id);
        } else {
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter title (or press Enter to skip):");
            String title = sc.nextLine();

            // Input for author
            System.out.println("Enter author (or press Enter to skip):");
            String author = sc.nextLine();

            // Input for category
            System.out.println("Enter category (or press Enter to skip):");
            String category = sc.nextLine();

            // Update the book details if the new values are not empty
            if (!title.isEmpty()) {
                book.setTitle(title);
            }
            if (!author.isEmpty()) {
                book.setAuthor(author);
            }
            if (!category.isEmpty()) {
                book.setCategory(category);
            }

            System.out.println("Book updated successfully!");
        }
    }


    public  void show_book(){
        System.out.println("Enter your choice \n1.show all books\n2.show book by title \n3.show book by author\n4 show book by year");
        Scanner sc=new Scanner(System.in);
        Integer choice=sc.nextInt();sc.nextLine();
        switch (choice){
            case 1:
                if(this.books.stream().count()==0){
                    System.out.println("No Book available ....");
                }
                else{
                    for(Book b:this.books){
                        System.out.println(b);
                    }
                }
                break;
            case 2:
                System.out.println("Enter book title");
                String title=sc.nextLine();
                List<Book> data=this.books.stream().filter(b->b.getTitle().equals(title)).collect(Collectors.toList());
                if(data.isEmpty()){
                    System.out.println("Not found any books by this title" );
                }
                else{
                    data.forEach(b->System.out.println(b));
                }
            break;
            case 3:
                System.out.println("Enter book author");
                String author=sc.nextLine();
                List<Book> data1=this.books.stream().filter(b->b.getAuthor().equals(author)).collect(Collectors.toList());
                if(data1.isEmpty()){
                    System.out.println("Not found any books by this author");
                }
                else{
                    data1.forEach(b->System.out.println(b));
                }
                break;
            case 4:
                System.out.println("Enter book pusblished year");
                Integer year=sc.nextInt();
                List<Book> data2=this.books.stream().filter(b->b.getPubYear().equals(year)).collect(Collectors.toList());
                if(data2.isEmpty()){
                    System.out.println("Not found any books by this year");
                }
                else{
                    data2.forEach(b->System.out.println(b));
                }
                break;
            default:
                System.out.println("Invalid choice try again");
                return;

        }
    }
    public void delete() throws  BookNotFoundException{
        System.out.println("Enter book Id which one you want to delete");
        Scanner sc =new Scanner(System.in);
        String id=sc.nextLine();
        Book book = this.books.stream()
                .filter(b -> b.getBookId().equals(id))
                .findFirst()
                .orElse(null);

        // Check if the book was found
        if (book == null) {
            throw new BookNotFoundException("No book found with the given Id: " + id);
        } else {
            // Remove the book from the collection
            this.books.remove(book);
            System.out.println("Book with Id " + id + " has been deleted.");
        }

    }



}
