package Astraction;

public class BMW extends autoTech implements Auto {

    public void Doors(){
        System.out.println("either 4 doors or 2 doors");
    }

    @Override
    public void Engine() {
        System.out.println("Minimum 1.0l or maximum 5.0l");
    }

    @Override
    public void saftey() {
        System.out.println("Must have seat belts and air bags features");
    }

    @Override
    public void wireless() {
        System.out.println("must have wireless charger for android and apple accessories");

    }
}
