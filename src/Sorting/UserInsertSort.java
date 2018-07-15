package Sorting;

public class UserInsertSort {

    public static void main(String[] args) {

        InsertSorting sort = new InsertSorting();
        int [] insert = {1,9,8,0,3,2,6,4,5};

        sort.insertionSort(insert);

        for(int a=0;a<insert.length;a++){
            System.out.println(insert[a]+"\t");
        }

        int zay[]={1,2,9,3,10,91,23};
        int temp;
        for(int i=1;i<zay.length;i++){
            for(int x=i;x>0;x--){
                if(zay[x] < zay[x-1]){
                    temp = zay[x];
                    zay[x] = zay[x-1];
                    zay[x-1] = temp;

                }
            }
        }for(int y=0;y<zay.length;y++){
            System.out.print(zay[y]+"\t");
        }

    }

}
