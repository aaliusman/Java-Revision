package InterviewProblems;

public class multipleSolutions {
    public static void main(String[] args) {

        int sum=0;
        for(int i=1;i<101;i++){
            sum = sum+i;
        }
        System.out.println(sum);

        //increasing loop
        int gm=1;
        for(int x = 1;x<5;x++){
            for(int y = 1;y<=x;y++){
                System.out.print(gm+"\t");
                gm++;

            }
            System.out.println(" ");
        }
        //loop decreasing
        int mg = 1;
        for(int m=1;m<5;m++){
            for(int n=m;n<5;n++){
                System.out.print(mg+"\t");
                mg++;
            }
            System.out.println(" ");
        }

        //Prime numbers
        for(int u=2;u<=51;u++){
            for(int w=2;w<=u;w++){
                if(u==w){
                    System.out.print(w+"\t");
                }
                if(u%w==0){
                    break;
            }

            }
        }
        System.out.println(" ");
        //Fibonnaci
        int a=0;
        int b=1;

        for(int c=0;c<10;c++){
            System.out.print(a+"\t");

            a=a+b;
            b=a-b;
        }

        System.out.println(" ");
        //reverse sTring
        String myname = "namsU";
        for(int na= myname.length()-1;na>=0;na--){
            System.out.print(myname.charAt(na));
        }
        System.out.println(" ");
        //to seperate one number
        int [] num ={1,0,3,5,0,0,7,0,9};
        int nm=0;
        int[] mun = new int[9];

        for(int p=0;p<num.length;p++){
            if(num[p]!=0){
                mun[nm]=num[p];
                nm++;
            }}
            for(int q=5;q<num.length;q++){
                mun[q]=0;
            }
            for(int r=0;r<mun.length;r++){
                System.out.print(mun[r]+"\t");
            }

        int n = 50;
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

