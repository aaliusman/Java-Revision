package Inheritance;

public class child extends Dad {
    public static void main(String[] args) {

        Dad dad = new Dad();

        System.out.println(dad.business("Dad has business of properties, investment and food supplier"));
        System.out.println(dad.wealth(35000, 100000));
        dad.cars();
        dad.house();
    }
}
