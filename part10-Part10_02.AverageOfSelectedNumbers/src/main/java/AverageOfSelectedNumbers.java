
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Implement a program, which reads user input.
If the user input is "end", program stops reading input. The rest of the input is numbers.

Then user is asked if the program should print the average of all the positive numbers,
or the average of all the negative numbers (n or p).
If the user selects "n", the average of all the negative numbers is printed.
Otherwise the average of all the positive numbers is printed.

Use streams to calculate the average and filter the numbers!*/
public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> list = new ArrayList<>();
        while (true) {
            String temp = scanner.nextLine();

            if (temp.equals("end")) {
                break;
            }
            list.add(temp);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String negOrPos = scanner.nextLine();

        if (negOrPos.contains("n")) {
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        if (negOrPos.contains("p")) {
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }

    }
}
