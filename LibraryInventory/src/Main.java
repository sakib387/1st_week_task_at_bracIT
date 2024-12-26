import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        BookFactory bookFactory=new BookFactory();
        Library library=Library.getLibraryInstance();
        System.out.println("Welcome to our Library");

        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your choice \n1.Add book\n2.Update book\n3.show all book or filtered data \n4.Delete book ");
            int choice=scanner.nextInt();scanner.nextLine();
            switch (choice)
            {
                case 1:
                    try {
                        System.out.println("Enter Book Type (e.g., ebook, audiobook):");
                        String type = scanner.nextLine();

                        System.out.println("Enter Book ID:");
                        String bookId = scanner.nextLine();

                        System.out.println("Enter Book Title:");
                        String title = scanner.nextLine();

                        System.out.println("Enter Book Author:");
                        String author = scanner.nextLine();

                        System.out.println("Enter Book publish year:");
                        Integer pubYear = scanner.nextInt();scanner.nextLine();

                        System.out.println("Enter Book Category:");
                        String genre = scanner.nextLine();


                        library.addBooks(bookFactory.createBook(type,bookId,title,author,pubYear,genre));
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                    break;
                case 2:
                    System.out.println("Enter book id to update book details..");
                    String id=scanner.nextLine();

                    try{
                        library.update(id);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    library.show_book();
                    break;
                case 4:
                    try {
                        library.delete();
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                    break;

                default:
                    System.out.println("Invalid choice. GOOD BUY.");
                    return;


            }
        }


    }

}