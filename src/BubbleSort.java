import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 35, -15, 7, 55, 1, -22};
        int upi = array.length - 1;

        System.out.println("Unsorted array:\t" +  Arrays.toString(array));

        for (int j = upi; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if(array[i+1]<array[i]){
                    Helpers.swap(array,i,i+1);
                }
            }
        }

        System.out.println("Bubble sort:\t" +  Arrays.toString(array));

    }
}
