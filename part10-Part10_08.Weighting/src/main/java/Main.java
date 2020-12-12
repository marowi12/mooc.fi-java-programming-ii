
public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Suitcase suitcase = new Suitcase(12);
        Item item1 = new Item("Apple", 3);
        Item item2 = new Item("Banana", 2);
        Item item3 = new Item("Ananas", 1);
        Item item4 = new Item("Orange", 4);

        Hold hold = new Hold(20);
        suitcase.addItem(item4);
        suitcase.addItem(item1);

        System.out.println(suitcase.totalWeight());
        suitcase.printItems();

        hold.addSuitcase(suitcase);
        System.out.println("_____________________________");
        System.out.println(hold.totalWeight());
        hold.printItems();
        
        System.out.println(suitcase);
    }

}
