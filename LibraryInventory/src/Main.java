//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookFactory bf=new BookFactory();
       Book b=bf.createBook("ebook","abc","sakib","hudai","a123");
       System.out.println(b);
    }
}