

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        String test = "17:23:05";
        Checker check = new Checker();
        
        System.out.println(check.isDayOfWeek(test));
        
        System.out.println("");
        System.out.println(check.allVowels(test));
        System.out.println("------------------------------");
        System.out.println(check.isDayOfWeek(test));
        
    }
}
