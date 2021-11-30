package hw8;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bull();
        Animal animal4 = new Tiger();

        animal1.voice();
        animal2.voice();
        animal3.voice();
        animal4.voice();
    }
}