package dz7.view;


public class Tiger extends Metod {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 350);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 3);
    }
}
