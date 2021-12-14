package hw8r.animal.starter;

import hw8r.animal.Animal;
import hw8r.animal.Cat;
import hw8r.animal.Cow;
import hw8r.animal.Dog;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        Animal[] animals = new Animal[]{cat, dog, cow};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}