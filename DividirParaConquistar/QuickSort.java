package DividirParaConquistar;

public class QuickSort {
   public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = particao(array,left,right);
            quickSort(array, left, pivot-1);
            quickSort(array, pivot+1, right);
        }
   }

   private static int particao(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        for (int j = left+1; j <= right; j++) {
            if (array[j] < pivot) {
                i++;
                trocar(array, i, j);
            }
        }
        trocar(array, left, i);
        return i;
   }

    private static void trocar(int[] array, int i, int j) {
            int temporario = array[i];
            array[i] = array[j];
            array[j] = temporario;
    }

    public static void main(String[] args) {
        int[] array = {4,5,78,2,5,8,2,58,32,6,8,42,5,89,43,2,5};

        for (int n: array) {
            System.out.print(n + " ");
        }

        System.out.println("");

        quickSort(array, 0, array.length-1);

        for (int n: array) {
            System.out.print(n + " ");
        }
    }

}
