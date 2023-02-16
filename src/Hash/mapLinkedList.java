package Hash;

import java.util.*;

public class mapLinkedList {

    public static void main(String[] args) {
//
//        List<String> Countries = new LinkedList<>();
//        Countries.add("USA");
//        Countries.add("Pakistan");
//        Countries.add("China");
//
//        List<String> Cities = new LinkedList<>();
//        Cities.add("Philadelphia");
//        Cities.add("Karachi");
//        Cities.add("London");
//
//        List<String> town = new LinkedList<>();
//        town.add("Bensalem");
//        town.add("Langhorne");
//        town.add("Model colony");
//        town.add("High Wycombe");
//
//        Iterator it = Countries.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        for(String mp:Cities){
//            System.out.println(mp);
//        }
//
//        Map<String, List<String>> map = new Hash<>();
//        map.put("Countries", Countries);
//        map.put("Cities", Cities);
//        map.put("Town", town);
//        for(Map.Entry entry: map.entrySet()){
//            System.out.println(entry.getKey()+": " +entry.getValue());
//        }


        Map<Integer, String> map = new HashMap<>();
        map.put(101, "finance");
        map.put(102, "Business");
        map.put(103, "Marketing");

        System.out.println(map.get(103));
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());

        }


        Map mp = new HashMap();
        mp.put("A", 3030);
        mp.put(201, "ABC");

//        Set set= mp.entrySet();
//        Iterator itr = set.iterator();
//        while(itr.hasNext()){
//        Map.Entry en = (Map.Entry) itr.next();
//            System.out.println(en.getKey()+" "+en.getValue());
//
//        }


//        MultipleSolutions ms = new MultipleSolutions("usman", 30, 120000, "Philadelphia");
//        HashMap<Integer, MultipleSolutions> m = new HashMap<Integer, MultipleSolutions>();
//        m.put(1, ("Usman", 34, 120000, "Philadelphia");
//        m.put(2, new MultipleSolutions("John", 34, 120000, "Philadelphia"));
//        m.put(3, new MultipleSolutions("MIke", 34, 120000, "Philadelphia"));
//        m.put(4, new MultipleSolutions("Steve", 34, 120000, "Philadelphia"));

//        for(Map.Entry<Integer, MultipleSolutions> ety:m.entrySet()){
//            MultipleSolutions ms= ety.getValue();
//            System.out.println(ety.getKey()+": "+ety.getValue(). + " " +ms.+" "+ms.salary+" "+ms.city);
//            System.out.println(ety.getKey() + " " + ety.getValue());
//        }

        Map<Integer, String> imp = new TreeMap<>();
        imp.put(103, "Akhtar");
        imp.put(102, "Sidra");
        imp.put(101, "Zayan");
        imp.put(101, "Usman");
        imp.put(102, "Burhan");
        System.out.println(imp);
        for(Map.Entry hg:imp.entrySet()){
            System.out.println(hg.getKey()+": "+hg.getValue());
        }

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");

        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));


        HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
        combineKeys.addAll(map3.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1, "A");
        map4.put(2, "B");

        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(1, "A");
        map5.put(2, "B");

        HashMap<Integer, String> map6 = new HashMap<Integer, String>();
        map6.put(1, "A");
        map6.put(2, "B");
        map6.put(3, "B");

        System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
        System.out.println(map4.values().equals(map5.values()));
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));

        //How to remove duplicate value from Hash
        HashSet<String> combineValues = new HashSet<>(map4.values());
//        combineValues.addAll(map6.values());
//        combineValues.removeAll(map4.values());
//        System.out.println(combineValues);
        combineValues.removeAll(map5.values());
        System.out.println(combineValues);


        System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map5.values())));
        System.out.println(map4.values().equals(map5.values()));
        System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map6.values())));
        System.out.println(map4.values().equals(map6.values()));

        ArrayList<Integer> aryList = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,3,45,2));


        aryList.removeIf(jum -> jum % 2 == 1);
        System.out.println(aryList);

        map6.put(null, "B");
        System.out.println(map6.get(null));

        System.out.println(map6);

        int count = 11;
        int tot = 10;

        if(count > 10) {
            tot += 15;
        } else {
            tot += 0;
        }
        System.out.println(tot);
        }

    }
                                                                                                  