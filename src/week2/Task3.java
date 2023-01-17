package week2;
// Дано четырехзначное число. Проверить является ли оно палиндромом.

import java.util.Scanner;

/*
        Входные данные: 1881
        Выходные данные: true

        Входные данные: 5081
        Выходные данные: false
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n > 999 && n < 10000) {
            int end = n % 10;
            int start = n / 1000;
            if (end != start) {
                System.out.println("Не палиндром!");
            } else {
                end = (n % 100) / 10;
                start = (n / 100) % 10;

                if (end != start) {
                    System.out.println("Не палиндром!");
                } else {
                    System.out.println("Палиндром!");
                }
            }

        } else {
            System.out.println("Ввели неправильное число!");
        }
    }
}
