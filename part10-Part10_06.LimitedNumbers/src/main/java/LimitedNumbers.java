
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("add numbers");
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            list.add(input);
        }
        
        list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s >1 && s < 6)
                .forEach(System.out::println);
    }
}
