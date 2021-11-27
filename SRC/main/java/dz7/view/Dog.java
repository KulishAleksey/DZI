package dz7.view;

import java.io.OutputStream;

public class Dog extends AnimalRunner {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 500);

    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }

}