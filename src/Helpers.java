public class Helpers {
    public static void swap(int[] array, int i, int j){
        if(i == j)
            return;
        int k = array[j];
        array[j] = array[i];
        array[i] = k;
    }
}
