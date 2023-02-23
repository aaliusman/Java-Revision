package JavaRevision;

import java.util.ArrayList;
import java.util.Arrays;

public class Polymorphism {

    //Overloading - same method, different parameters within same class,
    // we can also re-arrange the parameters
    //Overriding - same method name same parameters but different body and different class

    public void validateCountriesName() {
        ArrayList list1 = new ArrayList(Arrays.asList("Pakistan", "Afghanistan", "India", "Bangladesh"));
        ArrayList list2 = new ArrayList(Arrays.asList("Pakistan", "Afghanistan", "India", "Bangladesh"));


            if (list1.equals(list2)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

    }

    public void validateCitiesName() {
        ArrayList list1 = new ArrayList(Arrays.asList("Pakistan", "Afghanistan", "India", "Bangladesh"));
        ArrayList list2 = new ArrayList(Arrays.asList("Philadelphia", "Afghanistan", "India", "Bangladesh"));


        if (list1.equals(list2)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    // Method: we need to create with void or return data type
    // Do we need to pass parameters
    // we need a body
    // in the end whatever the method return // if we have void method then we don't need anything
    public int addTwoNumbers(int sales1, int sales2) {
        int totalSales = sales1 + sales2;
        return totalSales;
    }

    public boolean isPalindrome(String name) {

        //madam
        String name2 = "";
//        boolean isTrue = true;

        for (int i = name.length()-1; i>=0;i--) {
            name2 = name2+name.charAt(i);
        }
        if (name2.equals(name)) {
            return true;
        }
        return false;
    }


    //Polymorphism has two type overloading and overriding


    public static String getMyLocation (String city) {
        String location = "I live in "+city;
        return location;
    }

    public static String getMyLocation (String city, String state) {
        String location = "I live in "+city+", "+state;
        return location;
    }

}
