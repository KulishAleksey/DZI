package dz7.dogs;

import dz7.Animal;

public abstract class Dog extends Animal {

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 0.5);
    }
}
