package lesson3;

public class ThirdLessonRunner {

    public static void main(String[] args) {
        long summa = sum(35, 7);
        System.out.println("Сумма чисел 35 и 7 = " + summa);

        long subtraction = minus(35, 7);
        System.out.println("Разность чисел 35 и 7 = " + subtraction);

        long multi = multiplication(35, 7);
        System.out.println("Умножение чисел 35 и 7 = " + multi);

            double div = division(35, 7);
        System.out.println("Деление чисел 35 и 7 = " + div);

        double result = pow(2, 4);
        System.out.println("");

        double module = mod(16, 3);
        System.out.println("Остаток от деления числа 16 на 3 = " + module);
    }

    private static double division(int i, int i1) {
        return i / i1;
    }

    private static long multiplication(int i, int i1) {
        return i * i1;
    }

    private static long minus(int i, int i1) {
        return i - i1;
    }

    private static long sum(int i, int i1) {
        return i + i1;
    }

    private static long pow(int i, int i1) {
        return i/i1;
    }

    private static long mod(int i, int i1) {
        return i/i1;
    }

}
