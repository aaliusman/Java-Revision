package Sorting;

public class InsertSorting {

    int temp;

    public int[] insertionSort(int[] intSort) {
        for (int i = 1; i < intSort.length; i++) {
            for (int x = i; x > 0; x--) {
                if (intSort[x] < intSort[x - 1]) {
                    temp = intSort[x];
                    intSort[x] = intSort[x - 1];
                    intSort[x - 1] = temp;
                }
            }
        }
        return intSort;
    }
}
