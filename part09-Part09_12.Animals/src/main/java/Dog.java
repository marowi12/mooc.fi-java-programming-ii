/*Implement a class called Dog that inherits from Animal. 
Dog should have a parameterized constructor that can be used to name it. 
The class should also have a non-parameterized constructor, which gives the dog the name "Dog".
Another method that Dog must have is the non-parameterized bark, and it should not return any value (void). 
Like all animals, Dog needs to have the methods eat and sleep.

.*/
public class Dog extends Animal implements NoiseCapable {

    //Dog should have a parameterized constructor that can be used to name it.
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    //Another method that Dog must have is the non-parameterized bark, and it should not return any value (void). 
    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    public void makeNoise() {
        this.bark();
    }

}
