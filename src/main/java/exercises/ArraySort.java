package exercises;

import java.util.Arrays;

public class ArraySort {

    /**
     * Dado um array de numeros inteiros, ordena-lo de forma crescente
     */

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 2, 8, 3, 1, 19 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
