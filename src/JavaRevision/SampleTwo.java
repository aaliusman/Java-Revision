package JavaRevision;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleTwo extends JavaRev {


    //Overloading  same method name, same parameter, only different type of body
    public static String getMyLocation(String city, String state) {
        String message = "I love exploring "+city+", "+state;
        return message;
    }

    public static void verifyCountries() {

        ArrayList list1 = new ArrayList(Arrays.asList("Pakistan", "Afghanistan", "India", "Bangladesh"));
        ArrayList list2 = new ArrayList(Arrays.asList("Pakistan", "Afghanistan", "India", "Bangladesh"));
        System.out.println(list1.get(2));

        if (list1.equals(list2)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }

    public static void main(String[] args) {



        System.out.println(wal);
        System.out.println(multiplication);

        Sample sample = new Sample();
        System.out.println(sample.wal);
        System.out.println(sample.multiplication);


        Polymorphism poly = new Polymorphism();
        poly.validateCountriesName();
        poly.validateCitiesName();
        verifyCountries();
        int salesAfterExpense = poly.addTwoNumbers(1000, 20000) - 9000;
        System.out.println(salesAfterExpense);

        //Palindrome
        System.out.println(poly.isPalindrome("madartm"));

        //Overloading  - same method name but different parameters within same class
        System.out.println(poly.getMyLocation("Langhorne" ));
        System.out.println(poly.getMyLocation("Langhorne", "PA" ));


        System.out.println(getMyLocation("Zurich", "Switzerland"));





    }

}
