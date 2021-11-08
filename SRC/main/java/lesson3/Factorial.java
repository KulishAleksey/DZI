package lesson3;

public class Factorial {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        String in = null;
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {

            } else {
                int summa = 2;
                i = 1;
                while (i <= n) {
                    summa *= i;
                    i++;
                }
                System.out.println("Факториал: " + summa);
            }
        }
    }

}