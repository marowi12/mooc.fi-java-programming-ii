
/**
 *
 *
 * @param <T>
 */
public class List<T> {

    private T[] list;
    private int emtyIndex;

    //constructor, makes new array set index of first emty space in array to 0
    public List() {
        this.list = (T[]) new Object[10];
        this.emtyIndex = 0;
    }

    //add a new element to the list of type <T>
    public void add(T value) {
        if (this.emtyIndex == this.list.length) {
            this.grow();
        }
        this.list[this.emtyIndex] = value;
        this.emtyIndex++;
    }

    //if array is to small to contain new list, make new bigger array and copy the old list to the new array
    private void grow() {
        T[] newArray = (T[]) new Object[this.list.length + (this.list.length / 2)];
        for (int i = 0; i < this.list.length - 1; i++) {
            newArray[i] = this.list[i];
        }
        this.list = newArray;
    }

    //checks if a value is present in the array
    public boolean contains(T value) {
        return this.indexOfValue(value) >= 0;
    }

    //removes a value from the list
    public void remove(T value) {
        if (this.indexOfValue(value) >= 0) {
            for (int i = this.indexOfValue(value); i < this.emtyIndex; i++) {
                this.list[i] = this.list[i + 1];
            }
        }
        this.emtyIndex--;
    }

    //finds the index of the given value if exists, otherwise -1
    public int indexOfValue(T value) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value || this.list.equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // return value if index is valid, otherwise null
    public T value(int index) {
        if (index > this.list.length - 1) {
            return null;
        }
        return this.list[index];
    }

    //returns size of list
    public int size() {
        return this.emtyIndex;
    }
}
