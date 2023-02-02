package webinares.week2;

import java.util.Scanner;

/*
        Даны три целых числа a, b, c.
        Проверить есть ли среди них прямо противоположные. ( 5 и -5 прямо противоположные числа).
        0 и 0 не считать прямо противоположными.
        Входные данные
        -1 1 0
        Выходные данные
        true
        Входные данные
        -2 1 0
        Выходные данные
        false

        (a == b * -1 || b == c * -1 || c == a * -1)

 */
public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        boolean res = (a == -b && a != 0) || (a == -c && a != 0) || (b == -c && b != 0);
        System.out.println(res);
    }
}
