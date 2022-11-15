import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array:\t" +  Arrays.toString(array));

        for (int j = array.length - 1; j > 0; j--) {
            int largest = 0;
            for (int i = 0; i <= j; i++) {
                if(array[i]>array[largest]){
                    largest = i;
                }
            }
            Helpers.swap(array,largest,j);
        }

        System.out.println("Selection sort:\t" +  Arrays.toString(array));

    }

}
