package Hash;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
        marks.put("Naveen", 100);
        marks.put("Usman", 200);
        marks.put("Zayan", 300);
        marks.put("Peter", 500);

        System.out.println(marks.get("Usman"));

    }
}
