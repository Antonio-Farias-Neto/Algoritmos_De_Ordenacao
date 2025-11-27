package TempoLinear;

public class ExtendedCountingSort {
    /**
     * considerando a ordenação também com números negatívos. maior e menor podem ser achados
     * caso não sejam passados como parâmetro.
     * @param array array a ser ordenado
     * @param maior maior número do array
     * @param menor menor número do array
     */
    public static void countingSort(int[] array, int maior, int menor) {
        int[] c = new int[(maior-menor)+1];
        for (int i = 0; i < array.length; i++) {
            c[array[i] - menor]++;
        }
        
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }

        int[] b = new int[array.length];

        for (int i = array.length-1; i >= 0; i--) {
            b[c[array[i] - menor]-1] = array[i];
            c[array[i] - menor]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {3,2,4,7,4,-5,3,-5,0,5,6,7,1,0,1,7,1,2,3,-2,-3,-1,6,3};

        countingSort(array, 7, -5);

        for (int n: array) {
            System.out.print(n + " ");
        }

    }
}
