package dz7.view;

import dz7.Event;

public class DomesticCat extends Event {
    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 200);
    }

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 2);
    }

    @Override
    public boolean swim(double swim) {
        return false;
    }
}