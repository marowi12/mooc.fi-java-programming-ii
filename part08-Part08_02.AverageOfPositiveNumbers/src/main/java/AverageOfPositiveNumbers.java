
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divideBy = 0;
        int total = 0;

        while (true) {
            String test = scanner.nextLine();
            if (test.isEmpty()) {
                continue;
            }
            int add = Integer.parseInt(test);
            if (add == 0) {
                break;
            }
            if (add > 0) {
                total += add;
                divideBy++;

            }
        }

        if (divideBy == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double sum = (double) total / divideBy;
            System.out.println(sum);
        }

    }
}
