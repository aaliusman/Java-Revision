package abstraction;

public class Audi implements Cars {
    @Override
    public void door() {
        System.out.println("Must have atleast 2 doors");
    }

    @Override
    public void seats() {
        System.out.println("must have atleast 2 seats");
    }

    @Override
    public void engine() {
        System.out.println("must have engine size of 1.0l");
    }

    @Override
    public void automatic() {
        System.out.println("Must have power steering and windows");
    }

}
