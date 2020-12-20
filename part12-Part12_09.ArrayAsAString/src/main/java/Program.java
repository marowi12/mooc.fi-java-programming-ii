
import java.util.concurrent.ThreadLocalRandom;

public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = { {0, 5, 0}, {3, 0, 7} };

        

        System.out.println(arrayAsString(matrix));

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                str.append(array[i][j]);
            }
            str.append("\n");
        }
        return str.toString();
    }

}
