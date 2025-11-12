public class Selection {
   public static void selectionSort(int[] array) {
        for (int i = 0; i< array.length;i++) {
            int indiceDoMin = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[indiceDoMin]) {
                    indiceDoMin = j;
                }
            }
            troca(array,i,indiceDoMin);
        }
   } 

   private static void troca(int[] array, int i, int indiceDoMin) {
            int temporario = array[i];
            array[i] = array[indiceDoMin];
            array[indiceDoMin] = temporario;
        }


        public static void main(String[] args) {
        int[] array = {4,5,78,2,5,8,2,58,32,6,8,42,5,89,43,2,5};

        for (int n: array) {
            System.out.print(n + " ");
        }

        System.out.println("");

        selectionSort(array);

        for (int n: array) {
            System.out.print(n + " ");
        }
    }
}
