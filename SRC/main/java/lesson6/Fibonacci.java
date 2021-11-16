package lesson6;


import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        System.out.println("Фибоначчи числа " + n + ":");
        System.out.print(a + " " + b);
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            System.out.print(" " + fib);
        }
    }
}