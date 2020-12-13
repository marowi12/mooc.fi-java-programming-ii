
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here

//        List<Integer> list = new List();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//
//        list.remove(5);
//        System.out.println(list.contains(5));
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
    }

}
