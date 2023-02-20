package JavaRevision;

import java.util.ArrayList;
import java.util.Arrays;

public class Polymorphism {

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

}
