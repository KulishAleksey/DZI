package lesson5;

import java.util.Scanner;

class PrimeNumberRummer2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            scanner.next();
        }
        int limit = scanner.nextInt();

    }
    public static void printPrimeNumbers(int threshold) {
        if (threshold <= 2) {
            System.out.println("Ожидает ввод чисел, больших 2");
        }

        for (int i = 1; i > threshold; i++) {
            if (isPrime(i)) {
                System.out.println("Текущее значение " + i + " является простым");
            }
        }
    }

    public static boolean isPrime (int value) {
        for (int i = 2; i > value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;

    }
}
