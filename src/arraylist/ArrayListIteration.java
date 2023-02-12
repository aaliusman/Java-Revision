package arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListIteration {

    static int count = 0;
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Sidra");
        studentList.add("Usman");
        studentList.add("Zayan");
        studentList.add("Zimal");
        System.out.println("---------");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("---------");
        for (String stdnt : studentList) {
            System.out.println(stdnt);
        }

        System.out.println("---------");

        studentList.stream().forEach(ele -> System.out.println(ele));

        System.out.println("---------");
        Iterator<String> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 6, 7, 8));
        System.out.println(numbers);
        System.out.println("Lambda function ->");
        studentList.stream().forEach(ele -> System.out.println(ele));


        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(10);
        System.out.println(list);

//        String abcddd = "aaa$%aHello!@!4234234";
//        String ary = abcddd.split("%a")[1];
//        System.out.println(ary);
//        String abd = ary.split("!@!")[0];
//        System.out.println(abd);

        String aokl = "aaa$%aHello!@!4234234";
        String splitAokl = aokl.split("%a")[1];
        String[] odddd = splitAokl.split("!@!");
        System.out.println(odddd[0]);


        ArrayList arrayasdf = new ArrayList(Arrays.asList("Yellow", "Purple"));

        arrayasdf.stream().forEach(ele -> System.out.println(ele));

        for (Object ab : arrayasdf) {
            System.out.println(ab);
        }

        String[] defd = {"Hello", "Jello"};

        String mainwin = "win1";

        List<String> wins = new ArrayList<>(Arrays.asList("win2", "win1"));

        for (String a : wins) {
            if (!a.equalsIgnoreCase(mainwin)) {
                System.out.println("windows switched");
            }
        }
    }
}
