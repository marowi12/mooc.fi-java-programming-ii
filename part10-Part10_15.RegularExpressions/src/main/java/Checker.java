//Use regular expressions to create the method
//        public boolean isDayOfWeek(String string)
//which returns true if the parameter string is an abbreviation of a day of the week 
//        (mon, tue, wed, thu, fri, sat, sun)

public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }

    public boolean timeOfDay(String string) {
        String regex = "(([0-1][0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]";
        return string.matches(regex);

    }

}
