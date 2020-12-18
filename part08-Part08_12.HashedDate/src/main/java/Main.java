
public class Main {

    public static void main(String[] args) {
        // make test programs here
SimpleDate d = new SimpleDate(1, 2, 2000);
SimpleDate d1 = new SimpleDate(1, 2, 2000);
System.out.println(d.equals("heh"));
System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
        System.out.println(d.equals(d1));
        System.out.println("");
        System.out.println();
    }
}
