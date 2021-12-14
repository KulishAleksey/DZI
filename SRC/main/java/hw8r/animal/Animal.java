package hw8r.animal;

public abstract class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();
}
