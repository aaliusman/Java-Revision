package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Burhan");
        studentList.add("Usman");
        studentList.add("Zayan");
        studentList.add("Zimal");

        ArrayList<String> famList = new ArrayList<String>();
        famList.add("Usman");
        famList.add("Burhan");
        famList.add("Zimal");
        famList.add("Zayan");

        famList.stream().forEach(ele -> System.out.println(ele));

        Collections.sort(famList);
        Collections.sort(studentList);

        System.out.println(studentList);
        System.out.println(famList);

        System.out.println(famList.equals(studentList));

        ArrayList arrayList = new ArrayList(Arrays.asList("A", "B", "C", "D"));
        ArrayList aryLst = new ArrayList(Arrays.asList("A", "C", "B", "E"));

        arrayList.removeAll(aryLst);
        System.out.println(arrayList);


        ArrayList a1 = new ArrayList(Arrays.asList("A", "B", "C", "D"));
        ArrayList a2 = new ArrayList(Arrays.asList("A", "C", "B", "E"));
        a1.retainAll(a2);
        System.out.println(a1);


        ArrayList<Integer> number = new ArrayList(Arrays.asList(1, 2,3,4,5,6,7,8,9));
        number.removeIf(num -> num%2==0);
        System.out.println(number);


        number.add(3, 45);
        System.out.println(number);
    }
}
