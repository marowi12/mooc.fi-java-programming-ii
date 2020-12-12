
import java.util.*;

/*
Make a class Employees. Employees -object contains a list of Person -objects. 
The class has a constructor which takes no parameters, and the following methods:
 */
public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        list.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                iter.remove();
            }
        }
    }
}
