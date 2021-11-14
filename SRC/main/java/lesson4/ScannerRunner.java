package lesson4;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Представтесь!");
        String userName = Scanner.next();
        System.out.println("Добро пожаловать, " + userName + ". Введите число для расчета:");
        int value = Scanner.nextInt();
        System.out.println("Подтверждаем, что Вы ввели " + value);
    }
}
