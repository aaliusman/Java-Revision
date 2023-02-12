package InterviewProblems;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultipleSolutions {

    static SoftAssert softAssert = new SoftAssert();

    public String name;
    public int age;
    public int salary;
    public String city;

    public MultipleSolutions(String name, int age, int salary, String city) {

//        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
//        this.age=age;
//        this.salary= salary;
//        this.city=city;
    }

    //recursive function to print number 1 to 100
    public static void recursiveFunction(int number) {
        if (number <= 10) {
            System.out.println(number);
            number++;
            recursiveFunction(number);
        }
    }


    //add number to 100
    public static void addNumTo10(int num) {
        for (int i = 1; i <= 10; i++) {
            num = num + i;
            System.out.print(num + "\t");
        }
        System.out.println(num);
    }

    // count each integer in arraylist
    public static void countIntegerInArrayList(ArrayList<Integer> list) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int l : list) {
            if (hashMap.containsKey(l)) {
                hashMap.put(l, hashMap.get(l) + 1);
            } else {
                hashMap.put(l, 1);
            }
        }
        System.out.println(hashMap);
    }

    public static void countEachCharacterInString(String s) {
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i =0; i<s.length();i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        System.out.println(hashMap);
    }

    // increasing loop
    public static void increasingLoop() {
        int num = 1;
        for (int i = 1; i < 5; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    //decreasing Loop
    public static void decreasingLoop() {
        for (int i = 1; i < 5; i++) {
            for (int x = 4; x >= i; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseName(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void reverseStringWithSpace(String name) {
        StringBuilder sb = new StringBuilder();
        String[] nam = name.split(" ");
        for (int i = nam.length - 1; i >= 0; i--) {
            sb.append(nam[i]).append(" ");
        }
        String n = sb.toString();
        System.out.println(n.length());
        String nn = n.trim();
        System.out.println(nn);
        System.out.println(nn.length());
    }

    public static void towMaxNumbers(int[] num) {
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : num) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxOne = n;
            }
        }
        System.out.println("Max One: " + maxOne);
        System.out.println("Max Two: " + maxTwo);
    }

    public static int[] incByOne(int a, int b, int c) {
        int[] i = {a + 1, b + 1, c + 1};
        return i;
    }




    public static void main(String[] args) {


       countEachCharacterInString("aabbdddcccca");

        ArrayList<Integer> a1r = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 22, 4, 3, 4, 1, 2, 3, 4, 1, 2));
        String aaaa = "aaabbbbcccaaabbdddaacc";
        HashMap<Character, Integer> hmmm = new HashMap<>();
        for (int i = 0; i<aaaa.length();i++) {
            if(hmmm.containsKey(aaaa.charAt(i))) {
                hmmm.put(aaaa.charAt(i), hmmm.get(aaaa.charAt(i))+1);
            } else {
                hmmm.put(aaaa.charAt(i), 1);
            }
        }
        System.out.println(hmmm);



        int ist = 1;
        for (int i = 4; i>=1; i--) {
            for(int x = 1; x<=i; x++) {
                System.out.print(ist+"\t");
                ist++;
            }
            System.out.println();
        }

        int ak = '@' / 'a';
        String bc = "....";
        for (int i = ak; i <= bc.length(); i++) {
            System.out.print(i);
        }
        System.out.println();
        ArrayList ar1List = new ArrayList(Arrays.asList("Usman", "Sidra", "Zayan", "Zimal", "Burhan", "Rohan"));
        ArrayList ar2List = new ArrayList(Arrays.asList("Usman", "Sidra", "Zayan", "Zimal", "Burhan", "Rohan"));
        Map<Object, ArrayList<String>> map = new HashMap<>();
        map.put("name", ar1List);
        for (int i =0; i<ar1List.size();i++){
            Assert.assertEquals(map.put("name", ar2List).get(i),  ar2List.get(i));
        }
        int[] aaaaa = {1, 2, 3};
        System.out.println(aaaaa[1]);
        int[] incBy1 = incByOne(1, 2, 3);
        System.out.println(incBy1[0]);
        System.out.println(incByOne(1, 2, 3));

        ArrayList<Integer> aryList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 22, 4, 3, 4, 1, 2, 3, 4, 1, 2));
        System.out.println(aryList);
        int maxTowNum[] = {66, 1, 23, 45, 45, 56, 65, 6, 2, 4, 5};
        System.out.println(maxTowNum);


        //recursive function to print number 1 to 100
        recursiveFunction(1);
        //add number 1 t0 10
        addNumTo10(0);
        int nb = 1;
        for (int i = 0; i<=100; i++){
            nb = nb + i;
        }
        System.out.println(nb);

            // get dup value
            countIntegerInArrayList(aryList);
        //increasing loop
        increasingLoop();
        //decreasing Loop
        decreasingLoop();
        // reverseName
        reverseName("namsU");
        // reverseStringWithSpace
        reverseStringWithSpace("Usman Muhammad Hello");
        // tow maximum number in array list
        towMaxNumbers(maxTowNum);

        //Prime numbers
        for (int i = 2; i < 51; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    System.out.print(j + "\t");
                }
                if (i % j == 0) {
                    break;
                }
            }
        }

        System.out.println(" ");
        //Fibonacci
        int a = 0;
        int b = 1;
        for (int c = 0; c < 10; c++) {
            System.out.print(a + "\t");
            a = a + b;
            b = a - b;
        }

        System.out.println(" ");

        //to separate one number
        int[] num = {1, 0, 3, 5, 0, 0, 7, 0, 9};
        int nm = 0;
        int[] mun = new int[num.length];

        for (int p = 0; p < num.length; p++) {
            if (num[p] != 0) {
                mun[nm] = num[p];
                nm++;
            }
        }
        for (int q = 5; q < num.length; q++) {
            mun[q] = 0;
        }
        for (int r = 0; r < mun.length; r++) {
            System.out.print(mun[r] + "\t");
        }
        System.out.println("");

        System.out.println("**************");
        for (int x = 1; x <= 15; x++) {
            if (x % 3 != 0 && x % 5 != 0) {
                System.out.println(x);
            } else {
                if (x % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (x % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.println();
            }

        }
        //***************************//

        //Print factorial number
        ArrayList<Integer> factNumber = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();

        int expectedFact = 1;
        for (int j = 1; j <= 10; j++) {
            expectedFact = expectedFact * j;
            hashMap.put(j, expectedFact);
            System.out.println(hashMap);
        }

        int actualFact = 1;
        for (int i = 1; i <= 10; i++) {
            actualFact = actualFact * i;
            hashMap1.put(i, actualFact);
            softAssert.assertEquals(hashMap.get(i), hashMap1.get(i), hashMap.get(i) + "Failed");
            System.out.println(hashMap1);
        }

        softAssert.assertAll();

        // Java streams to print 1 to 100 without using for loop
        IntStream.range(1, 10).forEach(ele -> System.out.println(ele));

        int ary[] = {2, 3, 6, 7, 9, 11};
        int abd = 9;
        int ar[] = {3, 5, 6, 12};

        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length; j++) {
                if (ary[i] + ary[j] == 9) {
                    System.out.println(ary[i] + "+" + ary[j] + "=9");
                }
            }
        }
        // Print Unique numbers
        ArrayList<Integer> numb = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 5, 5));
        HashSet<Integer> hashSet = new HashSet<Integer>(numb);
        ArrayList<Integer> listWithoutDup = new ArrayList<>(hashSet);
        System.out.println(listWithoutDup);

        ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 5, 5));
        List<Integer> uniqueList = markList.stream().distinct().collect(Collectors.toList());
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

        for (int i = 5; i < 10; ++i) {
            if (i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }


    public static int getLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 1];
    }
}

