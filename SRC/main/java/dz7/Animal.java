package dz7;

import dz7.view.DomesticCat;
import dz7.view.Dog;
import dz7.view.Raccoon;
import dz7.view.Tiger;

public class Animal {
    public static void main(String[] args) {
        Event[] animals = {new DomesticCat(), new Tiger(), new Dog(), new Raccoon()};

        for (Event animal : animals) {
            System.out.println("--------------");
            System.out.printf("%s run: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(201));

            System.out.printf("%s jump: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.jump(0.5));

            System.out.printf("%s swim: %s\n\n",
                    animal.getClass().getSimpleName(),
                    animal.swim(8));
        }

        Event domesticCat = new DomesticCat();
        Event tiger = new Tiger();
        Event dog = new Dog();

        assert !domesticCat.run(201);
        assert domesticCat.run(200);

        assert !tiger.run(0);
        assert !tiger.run(351);
        assert tiger.run(350);

        assert dog.run(351) == true;
        assert dog.run(500) == true;
        assert dog.run(501) == false;
    }
}