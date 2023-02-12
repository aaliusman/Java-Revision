package abstraction;

import java.util.*;
import java.util.stream.Collectors;

public class Zayan {
    static int a = 0;
    static HashMap<String, Integer> hashMap = new HashMap<>();
    public static void main(String[] args) {

        Double po = 12.34;
        String op = "12.34";
        System.out.println(op.getClass().getSimpleName());
        Double opp = Double.parseDouble(op);
        System.out.println(opp.getClass().getSimpleName());


        if (opp.equals(po)) {
            System.out.println("Passed");
        }
        int lk = 23;
        double kl = 23.34;
        System.out.println(((Object) lk).getClass().getSimpleName());
        String s = Integer.toString(lk);
        String m = Double.toString(kl);
        System.out.println(s.getClass().getSimpleName());
        System.out.println(m.getClass().getSimpleName());

        String Zayan = "Zayan";
        Zayan = Zayan + " Usman";
        System.out.println(Zayan);
        ArrayList<Integer> numb = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 2, 2, 3, 3, 1, 4, 5, 5, 5, 5));
        HashSet<Integer> hashSet = new HashSet<Integer>(numb);
        ArrayList<Integer> listWithoutDup = new ArrayList<>(hashSet);
        System.out.println(listWithoutDup);

        Object nameaa = "usman";
        System.out.println(nameaa);

        ArrayList<String> markList = new ArrayList<String>(Arrays.asList("Usman", "Zayan", "Sidra", "Usman", "Zimal", "Burhan"));
        HashSet<String> hst = new HashSet(markList);
        System.out.println(hst);
        List<String> uniqueList = markList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

        int[] number = {1, 3, 45, 2, 98, 101, 24};
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        int largestNumber = number[number.length - 1];
        System.out.println(largestNumber);

        String usman = "namsU";
        String name = "Usman Muhammad Hello";

        String[] split_name = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=split_name.length-1; i>=0;i--){
            sb.append(split_name[i]).append(" ");
        }
        System.out.println(sb.toString());

        for (int i = usman.length() - 1; i >= 0; i--) {
            System.out.print(usman.charAt(i));
        }

        String arr[] = {"Usman", "Zayan", "Sidra", "Usman", "Zimal", "Burhan"};
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], 1);
            } else {
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }
        }
        System.out.println(hashMap);


        HashSet<String> hash = new HashSet<>();
        for (String ar : arr) {
            if (hash.add(ar) == false) {
                System.out.println(ar);
            }
        }

        int n = 1;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x <= i; x++) {
                System.out.print(n + "\t");
                n++;
            }
            System.out.println();
        }

        ArrayList list = new ArrayList(Arrays.asList("usman", "hello", "Hello", "hello", "usman", "usman", "zayan"));
        HashSet hash3 = new HashSet(list);
        System.out.println(hash3);

        System.out.println(countDupString(list));


        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        ArrayList ab3 = new ArrayList(Arrays.asList(1, 2, 3, 1, 4, 5, 6, 8, 9));
        HashSet set = new HashSet(ab3);
        System.out.println(set);


        System.out.println(getDupInt(numb));
        recursive(3);

        int h = 10, l=20;
        int p = h;
        h = l;
         l = p;
        System.out.println(h+" "+l);
        h = 10; l=20;
        int c = h+l;
        h=c-h;
        l=c-l;
        System.out.println(h+" "+l);

        StringBuffer sbf = new StringBuffer(String.valueOf(98748));
        System.out.println(sbf.reverse());

        StringBuilder stb = new StringBuilder(String.valueOf(17471));
        System.out.println(stb.reverse());

        int iu = 12345;
        String ui = Integer.toString(iu);
        System.out.println(ui.length());

        System.out.println(12345%5);

    }

    public static void recursive(int num) {
        if (a < num) {
            System.out.println("Usman");
            a++;
            recursive(num);
        }
    }

    public static HashMap<Integer, Integer> getDupInt(ArrayList<Integer> num) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (Integer i : num) {
            if (!hash.containsKey(i)) {
                hash.put(i, 1);
            } else {
                hash.put(i, hash.get(i) + 1);
            }
        }
        return hash;
    }

    public static HashMap<String, Integer> countDupString(List<String> name) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (String nam : name) {
            if (!hash.containsKey(nam)) {
                hash.put(nam, 1);
            } else {
                hash.put(nam, hash.get(nam) + 1);
            }
        }
        return hash;
    }

    public static String reverseString(String name) {
        StringBuilder sb = new StringBuilder();
        String[] n = name.split(" ");
        for (int i = n.length - 1; i >= 0; i--) {
            sb.append(n[i]).append(" ");
        }
        return sb.toString();
    }

}
