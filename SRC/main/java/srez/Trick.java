package srez;

public class Trick {
    interface I { void print(); }

    public I create() {
        return () -> { System.out.println("Hello!"); };
    }

    private I i = this::create;

    public void test() {
        i.print();
    }

    public static void main(String[] args) {
        Trick trick = new Trick();
        trick.test();
    }
}