package exercises;

public class DiagonalDifference {

    /**
     * Dado uma matriz de ordem quadrada, encontrar arr diferenca da soma de suas diagonais
     */

    static int diagonalDifference(int[][] arr) {
        int d1 = 0;
        int d2 = 0;
        int result;

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            d1 += arr[i][i];
            d2 += arr[i][j];
        }

        result = d1 - d2;

        return result > 0 ? result : result * -1;
    }

    public static void main(String[] args) {
        int[][] arr = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
        int result = diagonalDifference(arr);
        System.out.format("Resultado da soma das diagonais: %d", result);
    }
}
