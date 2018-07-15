package testNg;

import org.testng.Assert;

public class assertion {

    public static void main(String[] args) {

        assertion.checkAssert();

    }

    public static void checkAssert() {

        try {
            String ab = "My name is USMAN";
            String name = "my name is Usman";

//        Assert.assertEquals(ab, name);
            Assert.assertTrue(name.equalsIgnoreCase(ab));
        } catch (Exception ex) {
            System.out.println(" test is passed");
        }

        int n = 1000;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            }   else if(i%2==0 && i%5==0){
                System.out.println("CodilityCoders");
            }  else if(i%3==0 && i%5==0){
                System.out.println("TestCoders");
            }
            else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("**************");
        for (int x = 1; x <= n; x++) {
            if (x % 2 != 0 && x % 3 != 0 && x % 5 != 0) {
                System.out.print(x);
            } else {
                if (x % 2 == 0) {
                    System.out.print("Codility");
                }

                if (x % 3 == 0) {
                    System.out.print("Test");
                }
                if (x % 5 == 0) {
                    System.out.print("Coders");
                }
            }
            System.out.println();
        }

    }
}



