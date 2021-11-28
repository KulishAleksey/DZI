package dz7.view;

public class Dog extends Metod {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 500);

    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }

}