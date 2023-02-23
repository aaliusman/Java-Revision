package JavaRevision;

public class Camel implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Cow Sound");
    }

    @Override
    public void run() {
        System.out.println("Cheetah is a fastest animal");
    }

    @Override
    public void forest() {
        System.out.println("Full of tress");
    }
}
