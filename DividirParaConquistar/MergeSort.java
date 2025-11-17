package DividirParaConquistar;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void mergeSort(List<Integer> array) {
        if (array.size() > 1) {
            int mid = array.size()/2;
            List<Integer> left = new ArrayList<>(array.subList(0, mid));
            List<Integer> right = new ArrayList<>(array.subList(mid, array.size()));

            mergeSort(left);
            mergeSort(right);
            List<Integer> merged = merge(left, right);
            for (int i = 0; i < merged.size(); i++) {
            array.set(i, merged.get(i));
            }
        }
     }
    

    private static List<Integer> merge(List<Integer> arrayEsquerdo, List<Integer> arrayDireito) {
        List<Integer> resultado = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (arrayEsquerdo.size() > i && arrayDireito.size() > j) {
            if (arrayEsquerdo.get(i) < arrayDireito.get(j)) {
                resultado.add(arrayEsquerdo.get(i));
                i++;
            } else {
                resultado.add(arrayDireito.get(j));
                j++;
            }
        }
        while (i < arrayEsquerdo.size()) resultado.add(arrayEsquerdo.get(i++));
        while (j < arrayDireito.size()) resultado.add(arrayDireito.get(j++));
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(5);
        array.add(3);
        array.add(7);
        array.add(2);
        array.add(8);
        array.add(9);
        array.add(23);
        array.add(1);
        array.add(12);
        array.add(7);


        for (int n: array) {
            System.out.print(n + " ");
        }

        System.out.println("");

        mergeSort(array);

        for (int n: array) {
            System.out.print(n + " ");
        }
    }
}