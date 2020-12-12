
import java.util.*;

public class Main {

    public static void main(String[] args) {
        testDog();
        System.out.println("_______________________");
        testCat();
        System.out.println("_______________________");
        testNoiseCapable();
    }

    public static void testDog() {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
    }

    public static void testCat() {
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
    }

    public static void testNoiseCapable() {
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
}
