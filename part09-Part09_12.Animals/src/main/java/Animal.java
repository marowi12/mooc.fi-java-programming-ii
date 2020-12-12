/*First implement an abstract class called Animal. 
The class should have a constructor that takes the animal's name as a parameter. 
The Animal class also has non-parameterized methods eat and sleep that return nothing (void), 
and a non-parameterized method getName that returns the name of the animal.

The sleep method should print "(name) sleeps", and the eat method should print "(name) eats". 
Here (name) is the name of the animal in question.*/
public abstract class Animal {

    private String animalName;

    //The class should have a constructor that takes the animal's name as a parameter.
    public Animal(String name) {
        this.animalName = name;
    }

    //The Animal class also has non-parameterized methods eat and sleep that return nothing (void)
    //The sleep method should print "(name) sleeps", and the eat method should print "(name) eats". 
    public void eat() {
        System.out.println(this.animalName + " eats");
    }

    public void sleep() {
        System.out.println(this.animalName + " sleeps");
    }

    //and a non-parameterized method getName that returns the name of the animal.
    public String getName() {
        return this.animalName;
    }

}
