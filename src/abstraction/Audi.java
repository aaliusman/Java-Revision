package abstraction;

public class Audi extends technology implements Cars {
//    @Override
//    public void door() {
//        System.out.println("Must have at least 2 doors");
//    }

    @Override
    public void door(int numberOfDoors) {
        System.out.println("must have at least "+numberOfDoors+" doors.");
    }

    @Override
    public void seats() {
        System.out.println("must have at least 2 seats");
    }

    @Override
    public void engine() {
        System.out.println("must have engine size of 1.0l");
    }

    @Override
    public void automatic() {
        System.out.println("Must have power steering and windows");
    }

    @Override
    public void keyless() {
        System.out.println("Awesome feature of keyless entry");
    }
}
