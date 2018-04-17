package exercises;

public class EvenOdd {

    /**
     * Verificar se um dado numero eh par ou impar utilizando apenas funcoes matematicas basicas (+ - / *)
     */

    static void checkEvenOdd(int n) {
        if ((n / 2) * 2 == n) {
            System.out.format("O numero %d eh par %n", n);
        } else {
            System.out.format("O numero %d eh impar %n", n);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            checkEvenOdd(i);
        }
    }

}
