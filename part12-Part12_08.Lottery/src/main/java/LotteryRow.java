
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 7) {
            int draw = new Random().nextInt(40) + 1;
            if (!this.containsNumber(draw)) {
                this.numbers.add(draw);
            }
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.stream().anyMatch((x) -> (x == number))) {
            return true;
        }
        return false;
    }
}
