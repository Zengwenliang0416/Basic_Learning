public class BubbleSort {
    public static void main(String[] args){
        int[] array = new int[]{5,6,9,6,7};
        for (int i = array.length; i >= 0 ; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j-1] > array[j]){
                    int tpm = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tpm;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


}
