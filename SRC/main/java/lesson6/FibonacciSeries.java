package lesson6;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйсто число: ");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидается целое значение, а Вы ввели не подходящее " + text);
        }
        int n = scanner.nextInt();
        System.out.println("Наконец-то введено целой значение " + n);
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0]; // Массив не должен быть пустым
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
