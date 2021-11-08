package lesson3;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        System.out.println("Введите коэффицент а: ");
        a = scan.nextDouble();

        System.out.println("Введите коэффицент b: ");
        b = scan.nextDouble();

        System.out.println("Введите коэффицент c: ");
        c = scan.nextDouble();

        roots(a, b, c);
    }

    private static Scanner scan = new Scanner(System.in); // объект для ввода в консоль

    private static double a, b, c;// коэффиценты уравнения

    static void roots(double a, double b, double c) {//метод вычисляющий корни
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else {
            double d = b * b - 4 * a * c;// дискриминант

            if (d < 0) {// если дискриминат меньше 0
                System.out.println("Нет действительных решений уравнения");
            } else if (d == 0) { // если дискриминат равен нулю
                double x1 = -b / (2 * a);
                System.out.println("Уравнение имеет один действительный корень "
                        + String.format("%.3f", x1));
            } else {// если не то и не другое
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет два действительных корня "
                        + String.format("%.3f", x1) + " " + String.format("%.3f", x2));
            }
        }
    }
}
