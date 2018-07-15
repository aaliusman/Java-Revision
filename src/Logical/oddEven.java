package Logical;

public class oddEven {

    public static void main(String[] args) {

        int num = 21;

        if(num %2== 0){
            System.out.println(num+": this is a even number");
        }
        System.out.println(num+": this is a odd number");

        int array[]= {1,23,45,66,87,90};

        for(int i = 0;i<array.length;i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + ": This is a even number");

            } else {


                System.out.println(array[i] + ":  this is a odd number");
            }

        }
    }
}
