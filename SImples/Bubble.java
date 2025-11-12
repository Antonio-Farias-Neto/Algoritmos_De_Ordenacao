public class Bubble {
    public static void buubleSort(int[] array) {
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i-1] > array[i]) {
                    trocar(array, i );
                    trocou = true;
                }
            }
        }
    }

    private static void trocar(int[] array, int indice) {
        int temporario = array[indice-1];
        array[indice-1] = array[indice];
        array[indice] = temporario;
    }

    public static void main(String[] args) {
        int[] array = {4,5,78,2,5,8,2,58,32,6,8,42,5,89,43,2,5};

        for (int n: array) {
            System.out.print(n + " ");
        }

        System.out.println("");

        buubleSort(array);

        for (int n: array) {
            System.out.print(n + " ");
        }
    }
}