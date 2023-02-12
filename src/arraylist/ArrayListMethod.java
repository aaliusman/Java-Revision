package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Sidra");
        studentList.add("Usman");
        studentList.add("Zayan");

        ArrayList<String> famList = new ArrayList<String>();
        studentList.add("Kamran");
        studentList.add("Burhan");
        studentList.add("Zimal");
        studentList.add("Zayan");

        famList.addAll(studentList);
        System.out.println(famList);

        famList.removeAll(studentList);
        System.out.println(famList);

        famList.clear();
        System.out.println(famList);

        System.out.println(studentList.contains("Zayan"));
        System.out.println(studentList.indexOf("Zayan"));
        System.out.println(studentList.indexOf("Zayan") == 2);

        ArrayList<String> ofcList = new ArrayList<String>(Arrays.asList("Naveen", "Hello", "Jello", "Bello", "Naveen"));
        System.out.println(ofcList.lastIndexOf("Jello"));


        System.out.println(ofcList);
        ofcList.remove(1);
        System.out.println(ofcList);
        ofcList.remove("Naveen");
        System.out.println(ofcList);
        ofcList.remove("Naveen");
        System.out.println(ofcList);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,4));

//        numbers.removeIf(num -> num%2==0);
//            System.out.println(numbers);

        numbers.removeIf(num -> num%2==1);
        System.out.println(numbers);

        ArrayList<Integer> numbersAgain = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,4));
        numbersAgain.retainAll(Collections.singleton(1));
        System.out.println(numbersAgain);

        ArrayList<String> ofcListTwo = new ArrayList<String>(Arrays.asList("Roberto", "Hello", "Jello", "Bello", "Naveen"));

        Object arr[] = ofcListTwo.toArray();
        System.out.println(Arrays.toString(arr));


        for(String ofce: ofcListTwo){
            System.out.println(ofce);
        }

    }
}
