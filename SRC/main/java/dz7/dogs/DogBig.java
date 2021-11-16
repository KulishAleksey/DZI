package dz7.dogs;

import java.io.OutputStream;

public class DogBig extends Dog {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 500);

    }

    public void run() {
        System.out.println("Бобик пробежал 560  м");
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }

    public void swim() {
        System.out.println("Бобик проплыл " + OutputStream.nullOutputStream());
    }
}