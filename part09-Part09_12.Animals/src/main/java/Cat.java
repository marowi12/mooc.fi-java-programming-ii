/*Next to implement is the class Cat, that also inherits from the Animal class. 
Cat should have two constructors: one with a parameter, used to name the cat according to the parameter, 
and one without parameters, in which case the name is simply "Cat". 

Another method for Cat is a non-parameterized method called purr that returns no value (void). 
Cats should be able to eat and sleep like in the first part.

Here's an example of how the class Cat is expected to function:*/

public class Cat extends Animal implements NoiseCapable {

    //Cat should have two constructors: one with a parameter, used to name the cat according to the parameter, 
    public Cat(String name) {
        super(name);
    }

    //and one without parameters, in which case the name is simply "Cat". 
    public Cat() {
        super("Cat");
    }

    //Another method for Cat is a non-parameterized method called purr that returns no value (void).
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    public void makeNoise() {
        this.purr();
    }
}
