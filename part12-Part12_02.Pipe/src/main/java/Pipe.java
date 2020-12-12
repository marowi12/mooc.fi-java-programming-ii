
import java.util.ArrayList;


/**Implement a class called Pipe, which has a single generic parameter type.
* The pipe works, such that we can add values into it and values can be taken out.
* Adding to the pipe happens from one end, and taking out from the other end.
* In other words, we always remove the value which has been inside the pipe the longest and add to it the newest value.
*
*Use ArrayList to implement the internal functionality of the class.
 * 
 * @param <T>
 */

public class Pipe <T> {

private ArrayList<T> list;
    
    /*The class should provide a parameterless constructor*/
    public Pipe () {
        list = new ArrayList<>();
    }
    
    /* puts an object with a type in accordance with the type parameter given to the the class into the pipe.*/
    public void putIntoPipe(T value) {
        list.add(value);
    }
    /*takes out the value, which has been in the pipe the longest. 
    In case there is nothing in the pipe, return null. 
    Calling the method returns the value, which has been in the pipe the longest, and removes it from the pipe.*/
    public T takeFromPipe() {
        if (list.isEmpty()) {
            return null;
        }
        T temp = list.get(0);
        list.remove(0);
        return temp;
    }
   /* returns the value true if the pipe has values. In case the pipe is empty, it returns the value false.*/
    public boolean isInPipe() {
        return !list.isEmpty();
    }
    
}

