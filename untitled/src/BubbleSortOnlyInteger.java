public class BubbleSortOnlyInteger {

    static void bubbleSort(int[] arraySort) {
        int n = arraySort.length;
        int temp = 0;
        boolean swapped = false;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arraySort[j - 1] > arraySort[j]) {
                    // swap elements
                    temp = arraySort[j - 1];
                    arraySort[j - 1] = arraySort[j];
                    arraySort[j] = temp;
                    swapped = true;
                }
            if (!swapped) {
                break;
            }
            }
        }
    }
}
