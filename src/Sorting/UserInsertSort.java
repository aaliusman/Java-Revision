package Sorting;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class UserInsertSort {

    @Test(dataProvider = "dataList")
    public void getNames(String name, String month) {
        System.out.println(name +"-"+month);
    }

    public static void main(String[] args) {

        InsertSorting sort = new InsertSorting();
        int[] insert = {567, 56561, 9, 8, 0, 3, 2, 6, 4, 5, -1};

        sort.insertionSort(insert);

        for (int a = 0; a < insert.length; a++) {
            System.out.print(insert[a] + "\t");
        }
        System.out.println();
        int zay[] = {1, 2, 9, 3, 10, 91, 23};
        int temp;
        for (int i = 1; i < zay.length; i++) {
            for (int x = i; x > 0; x--) {
                if (zay[x] < zay[x - 1]) {
                    temp = zay[x];
                    zay[x] = zay[x - 1];
                    zay[x - 1] = temp;

                }
            }
        }
        for (int y = 0; y < zay.length; y++) {
            System.out.print(zay[y] + "\t");
        }
        System.out.println();

        int a [][] = {{1,2,3}, {6,7,8}, {89, 98, 76}};

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<=a.length-1;j++) {
                System.out.println(a[i][j]);
            }
        }

        String filePath = "/Users/bravo1516/Downloads";

        File file = new File(filePath);
//        System.out.println(file.listFiles()[0]);
        File download[] = file.listFiles();
        for(File e: download) {
            if(e.isFile()){
                System.out.println("File name: " + e.getName());
            } else if(e.isDirectory()) {
                System.out.println("Directory name: " + e.getName());
            } else {
                System.out.println(e.getName());
            }
        }
    }

    @DataProvider(name = "dataList")
    public Object [] [] getDataList () {
        return new Object[][] {{"Usman", "Dec"}, {"Sidra", "June"}, {"Burhan", "May"}};
    }
}
