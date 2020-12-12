
import java.util.*;
import java.util.stream.IntStream;

/*Implement a program, which reads user input.
If the user input is "end", the program stops reading input. 
The rest of the input is numbers. 
When the user input is "end", the program prints the average of all of the numbers.

Implement calculating the average using a stream!*/
public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        
        
        while (true) {
            String temp = scanner.nextLine();

            if (temp.contains("end")) {
                break;
            }
            list.add(temp);
        }
        
        double average = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
