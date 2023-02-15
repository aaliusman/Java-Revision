package Sorting;

import java.lang.reflect.Array;

public class JavaRev {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Hello World");
        System.out.println("Hello Hello");


        // Data type  -> give name  = assign the value
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
        System.out.println(45+aaa);

        float n = 2.34F;
        float bb = 3.45F;

        int i = 125;
        float f = i;
        System.out.println(f);

        System.out.println(bb / n);

        char mm = '4';
        int aaal = 56;
        String lm = Integer.toString(aaal);

        String abc = Character. toString(mm);
        System.out.println(33+abc);


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
        pp+=2;
        pp+=2;
        System.out.println(pp);

        System.out.println(uj);

        int tr = 1;
        int abd = 3;
        int hhh = 4;
        int trr = abd + hhh;
        System.out.println(trr);


        //Expected value/results
        String namee = "Equal to";

        if ( namee != "Equal to jlj" ) {
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


        if ( 45 >= 67) {
            System.out.println("Greater or equal");
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
        } else {
            System.out.println("Not all condition passed");
        }



    }
}
