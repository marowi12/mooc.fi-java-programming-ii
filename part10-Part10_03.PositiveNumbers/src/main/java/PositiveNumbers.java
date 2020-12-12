
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*In the exercise template, implement the class method , which receives an ArrayList of integers,
and returns the positive integers from the list.public static List<Integer> positive(List<Integer> numbers)

Implement the method using stream! 
For collecting the numbers try the command in addition to the command.Collectors.toList()Collectors.toCollection(ArrayList::new)*/
public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        System.out.println(positive(list));
    }

    //In the exercise template, implement the class method , which receives an ArrayList of integers,
//and returns the positive integers from the list.public static List<Integer> positive(List<Integer> numbers)
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> values = numbers.stream()
                .filter(s -> s > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }
}
