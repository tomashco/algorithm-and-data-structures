import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted array:\t" +  Arrays.toString(array));

        insertionSort(array);

        System.out.println("Insertion sort:\t" +  Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j+1; i > 0; i--) {
                if (array[i]<array[i-1]) {
                    Helpers.swap(array, i, i-1);
                } else {
                    break;
                }
            }
        }
    }
}
