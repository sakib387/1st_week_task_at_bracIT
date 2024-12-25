import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
       // System.out.println(list);
         ArrayList list1=new ArrayList();
         list1.add("sakib");
         list1.add(list);
        // System.out.println(list1.get(0));

        Stream  str= list1.stream(  );
    }
}