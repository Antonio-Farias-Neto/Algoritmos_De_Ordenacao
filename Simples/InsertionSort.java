public class InsertionSort {
   public static void insertionSort(int[] array) {
    for (int j = 1; j < array.length; j++) {
        int i = j-1;
        int key = array[j];
        while (i >= 0 && array[i] > key) {
            array[i+1] = array[i];
            array[i] = key;
            i--;
        }
        key = array[i+1];
    }
   }
   
   public static void main(String[] args) {
        int[] array = {4,5,78,2,5,8,2,58,32,6,8,42,5,89,43,2,5};

        for (int n: array) {
            System.out.print(n + " ");
        }

        System.out.println("");

        insertionSort(array);

        for (int n: array) {
            System.out.print(n + " ");
        }
    }
}
