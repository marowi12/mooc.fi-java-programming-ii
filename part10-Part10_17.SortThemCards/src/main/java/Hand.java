
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
public void add(Card card) adds a card to the hand
public void print() prints the cards in hand as shown in the example below
 */
public class Hand implements Comparable<Hand> {

    private List<Card> list;

    public Hand() {
        this.list = new ArrayList();
    }

    public void sort() {
        Collections.sort(list);
    }

    //prints the cards in hand as shown in the example below
    public void print() {
        Iterator<Card> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    //adds a card to the hand
    public void add(Card card) {
        this.list.add(card);
    }

    public void sortBySuit() {
        BySuitInValueOrder c = new BySuitInValueOrder();
        Collections.sort(this.list, c);
    }

    @Override
    public int compareTo(Hand other) {
        int x = this.list.stream()
                .map(s -> s.getValue())
                .reduce(0, Integer::sum);

        int y = other.list.stream()
                .map(s -> s.getValue())
                .reduce(0, Integer::sum);

        return Integer.compare(x, y);
    }

}
