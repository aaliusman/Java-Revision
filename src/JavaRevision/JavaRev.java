package JavaRevision;


import java.util.*;

public class JavaRev extends Sample{
    public static void main(String[] args) {

        System.out.println();
        System.out.print("Hello World");
        System.out.println("Hello Hello");

        // for mac users command+/   and windows ctrl + \
        // Data type  -> give name  = assign the value
        // System.out.println("Hello Comment only shouldn't print");
        // Only one variable name can be use within class
        // Concatenation

        //Primitive data type
        int num = 34;
        System.out.println();
        num = 45;
        int num2 = 55;
        System.out.println("sum is equal to:" + num + num2);


        char ch = '5';

        // no primitive data type
        String nam = "Usman";
        System.out.println(nam);

        int aa = 45;
        String aaa = Integer.toString(aa);
        System.out.println(45 + aaa);

        float n = 2.34F;
        float bb = 3.45F;

        int i = 125;
        float f = i;
        System.out.println(f);

        System.out.println(bb / n);

        char mm = '4';
        int aaal = 56;
        String lm = Integer.toString(aaal);

        String abc = Character.toString(mm);
        System.out.println(33 + abc);


        int a = 89;

        if (a > 90) {
            System.out.println("Hello");
        } else if (a == 90) {
            System.out.println("Bye bye");
        } else {
            System.out.println("Morning");
        }


        int x = 10;
        int y = 9;
        System.out.println(x > y);


        // non primitive data type
        // Array, Class, String, and Interface

        String car = "BMW";

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Ford"};

        // Array Declaration
        String array[] = new String[5];
        array[0] = "Alpha";
        array[4] = "Bravo";

        System.out.println(array[4]);
        System.out.println(array[0]);


        System.out.println(array[4]);

        // Array Declaration
        int ar[] = new int[4];


        int gh = 56;
        System.out.println(gh * 2);

        //Ampersand %
        int st = 57 % 8;
        System.out.println(st);

        int uj = 1;

        // uj = uj + 1
        uj++;
        uj++;
        ++uj;
        uj++;
        ++uj;
        uj--;

        int pp = 2;
        pp += 2;
        pp += 2;
        System.out.println(pp);

        System.out.println(uj);

        int tr = 1;
        int abd = 3;
        int hhh = 4;
        int trr = abd + hhh;
        System.out.println(trr);


        //Expected value/results
        String namee = "Appium";

        if (namee != "Appium Tool") {
            System.out.println("Passed");
        } else {
            System.out.println("Test failed");
        }

        int lk = 78;
        if (lk != 78) {
            System.out.println("Not equal to 78");
        } else {
            System.out.println("Equal to 78");
        }


        if (45 < 68) {
            System.out.println("Hello World");
            System.out.println("Don't print this line");
            int poi = 45;
            String fg = "dslfkjaslfj";
        } else {
            System.out.println("not equal");
        }

        String a1aa = "Kashifa";
        if (45 <= 67) {
            System.out.println(a1aa);
        } else {
            System.out.println("not equal or greater");
        }

        // we use .equals to compare string
        if ("hello".equals("Hello".toLowerCase())) {
            System.out.println("passed");
        } else {
            System.out.println("Failed");
        }

        String uy = " Hello World ";
        System.out.println(uy.length());

        // remove extra space before and after the string
        uy = uy.trim();
        System.out.println(uy.length());


        //Logical operator
        if (45 > 20 && 45 < 67 && 45 < 78) {
            System.out.println("All conditions passed");
        } else {
            System.out.println("Not all condition passed");
        }


        //Logical operator for pipe we need to have at least one condition true
        if (45 < 20 || 45 > 67 || 45 > 78) {
            System.out.println("Some or all conditions passed");
        } else if (45 > 20 || 45 > 67 || 45 > 78) {
            System.out.println("Not all condition passed");
        } else {
            System.out.println("Helle world");
        }


        if (1 > 2) {
            System.out.println("hello");
        } else {
            System.out.println("No hello");
        }


        String[] programmingLanguage = {"Java", "Python", "Kotlin"};


        System.out.println(Math.max(5, 10));

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

// Loops
        int ikk = 0;
        while (ikk < 8) {
            System.out.println("dfgjlkjfgjldgljkfg");
            ikk++;
        }

        int ino = 0;
        do {
            System.out.println(ino);
            ino++;
        }
        while (8 < 3);


        String name = "Usman";
        System.out.println(name.length());
       // name[0] = 'U'
        // name [1] = 's'
        // name [2] = 'm'
        // name [3] = 'a'
        // name [4] = 'n'

        String nnn = "namsU";
        // Index and Array always start with 0
        // length = 5-1


        //dynamic forloop
        for (int g =nnn.length()-1; g >=0 ; g--) {
            System.out.print(nnn.charAt(g));
        }

        //static forloop
        for ( int k = 0; k<5; k++) {
            System.out.println(k);
        }

        //Arrays size is fixed or static
        //Arrays String[] cars = {"Volvo", "BMW", "Ford"}


        //ArrayList  - Size can be change according to situation

        String[] carss = {"Volvo", "BMW", "Ford", "Tesla", "Cadilac"};
        ArrayList<String> carrss = new ArrayList<String>();
        for ( int k = 0; k<5; k++) {
            carrss.add(carss[k]);
        }
        carss[4] = "Honda";
        System.out.println(carss[4]);
//        carss[5] = "Honda";
//        System.out.println(carss[5]);

        System.out.println(carrss.get(4));

        if (carrss.get(2).equals("Ford")) {
            System.out.println("test passed");
        } else {
            System.out.println("Test failed");
        }


        //how to print increasing pyramid or number
        // Nested forloop
        //1      *
        //2 3    * *
        // 456      *  *  *
        // 7 8 9 10    * * * *


        Random rand = new Random();
        // Setting the upper bound to generate the
        // random numbers in specific range
        int upperbound = 25;
        // Generating random values from 0 - 24
        // using nextInt()
        int int_random = rand.nextInt(upperbound);

        // * * * *
        // * * *
        //* *
        // *

        //decreasing number by 1
        int lkj = 2;
        for (int o = 1; o < 5; o++ ) {
            for (int m = 4; m >= o; m--) {
                System.out.print("*"+"\t");
//                lkj = lkj +2;
            }
            System.out.println();
        }

        // increasing number by 1
        for (int o = 1; o < 5; o++ ) {
            for (int m = 1; m <= o; m++) {
                System.out.print("*"+"\t");
//                lkj = lkj +2;
            }
            System.out.println();
        }







        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");






        ArrayList<String> ary = new ArrayList();
        ary.add("England");
        ary.add("Germany");
        ary.add("Pakistan");
        System.out.println(ary);

        LinkedList<String> ary2 = new LinkedList<>();
        ary2.add("Hello");
        ary2.add("Yellow");
        ary2.add("Brown");
        System.out.println(ary2);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        // Different types forLoop
        for (int im = 0; im<ary.size();im++) {
            System.out.println(ary.get(im));
        }
        for (String country: ary) {
            System.out.println(country);
        }

        //Inheritance
        Sample sam = new Sample();

        String aaaa = sam.wal + " is the best place for shopping";
        int mull = sam.multiplication + 10;
        System.out.println(aaaa);
        System.out.println(mull);
        System.out.println(sam.wal);


        String a2 = wal + " is the best place for shopping";
        int m2 = multiplication + 10;

        System.out.println(a2);
        System.out.println(m2);


        System.out.println(multiplication);
        System.out.println(wal);

        // Create a HashMap object called capitalCities
        ArrayList<String> tech = new ArrayList(Arrays.asList("Volvo1", "BMW1", "Ford12", "Tesla1", "1Cadillac"));

        ArrayList<String> cars1 = new ArrayList(Arrays.asList("Volvo1", "BMW1", "Ford1", "Tesla1", "1Cadillac"));
        ArrayList<String> cars2 = new ArrayList(Arrays.asList("Volvo2", "BMW2", "Ford2", "Tesla2", "2Cadillac"));
        ArrayList<String> cars3 = new ArrayList(Arrays.asList("Volvo3", "BMW3", "Ford3", "Tesla3", "3Cadillac"));
        ArrayList<String> cars4 = new ArrayList(Arrays.asList("Volvo4", "BMW4", "Ford4", "Tesla4", "4Cadillac"));
        System.out.println(cars1);
        HashMap<String, ArrayList<String>> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", cars1);
        capitalCities.put("Germany", cars2);
        capitalCities.put("Norway", cars3);
        capitalCities.put("USA", cars4);
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.get("USA").get(2));

        for (String k: capitalCities.keySet()) {
            System.out.println(k+": "+ capitalCities.get(k) );
        }

        for (int q = 0; q<tech.size();q++) {
            if (capitalCities.get("England").get(q).equals(tech.get(q))) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }



        Camel camel = new Camel();
        camel.animalSound();
        camel.run();
        camel.forest();

        ConstructorExample cons = new ConstructorExample();
        System.out.println(cons.car);


    }
}
