package dz7.view;

import dz7.Event;

public abstract class Metod extends Event {

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 0.5);
    }
}
