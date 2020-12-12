
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }
/*The exercise template includes a template for the method .
    Implement a functionality there that gathers numbers divisible by two, three or five from the list it receives as a parameter, 
    and returns them as a new list. 
    The list received as a parameter must not be altered.public static ArrayList<Integer> divisible(ArrayList<Integer> numbers)*/
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> values = numbers.stream()
                .filter(s -> (s % 3 == 0) || (s % 2 == 0) || (s % 5 == 0))
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }

}
