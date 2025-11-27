package TempoLinear;

public class CountingSort {
    
    /**
     * Desconsiderando números negativos, k pode ser achado caso não seja passado como parâmetro.
     * @param array array a ser ordenado
     * @param k maior número do array
     */
    public static void countingSort(int[] array, int k) {
        int[] c = new int[k+1];
        for (int i = 0; i < array.length; i++) {
            c[array[i]]++;
        }
        
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }

        int[] b = new int[array.length];

        for (int i = array.length-1; i >= 0; i--) {
            b[c[array[i]]-1] = array[i];
            c[array[i]]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = b[i];
        }
    } 
    
    public static void main(String[] args) {
        int[] array = {3,2,4,7,4,4,3,2,0,5,6,7,1,0,1,7,1,2,3};

        countingSort(array, 7);

        for (int n: array) {
            System.out.print(n + " ");
        }

    }
}
