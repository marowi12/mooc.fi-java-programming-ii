
import java.util.ArrayList;
import java.util.Random;


public class Program {

    public static void main(String[] args) {

                    ArrayList<String> myList = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < 1000000; i++) {
            myList.add("" + i);
            hashMap.add("" + i, "" + i);
        }
    }

}
