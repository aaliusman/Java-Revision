package HashMap;

import java.util.*;

public class mapLinkedList {
    public static void main(String[] args) {

        List<String> Countries = new LinkedList<>();
        Countries.add("USA");
        Countries.add("Pakistan");
        Countries.add("China");

        List<String> Cities = new LinkedList<>();
        Cities.add("Philadelphia");
        Cities.add("Karachi");
        Cities.add("London");

        List<String> town = new LinkedList<>();
        town.add("Bensalem");
        town.add("Langhorne");
        town.add("Model colony");
        town.add("High Wycombe");

        Iterator it = Countries.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(String mp:Cities){
            System.out.println(mp);
        }

        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("Countries", Countries);
        map.put("Cities", Cities);
        map.put("Town", town);
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+": " +entry.getValue());
        }
    }
}
