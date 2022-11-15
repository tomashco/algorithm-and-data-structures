import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        int gap = (int) Math.floor(((float) array.length)/2);
        System.out.println("Unsorted array:\t" +  Arrays.toString(array) + " " + gap);

        while(gap>1){
            for (int j = gap; j >= 0; j-= gap) {
                for (int i = j; i < array.length; i++) {
                    if(i-gap < 0){
                        continue;
                    }
                    if (array[i - gap] > array[i]) {
                        Helpers.swap(array, i - gap, i);
                        System.out.println(array[i - gap] + " " + array[i] + " " + Arrays.toString(array));
                    }
                }
            }
            gap = (int) Math.floor((float) gap/2);
        }
        System.out.println("before insertion sort: " + Arrays.toString(array));
        InsertionSort.insertionSort(array);
        System.out.println("Shell sort:\t" +  Arrays.toString(array));
    }
}
