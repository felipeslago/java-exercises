package exercises;

public class Fibonnaci {

    /**
     * Apresentar a sequencia fibonnaci de um dado numero
     */

    static int fibonnaci(int number) {
        if (number < 2) {
            return number;
        }

        return fibonnaci(number - 1) + fibonnaci(number - 2);
    }

    public static void sequence() {

    }

    public static void main(String[] args) {
        int number = 10;

        for (int i = 0; i <= number; i++) {
            int result = fibonnaci(i);
            System.out.format("F(%d) = %d %n", i, result);
        }
    }
}
