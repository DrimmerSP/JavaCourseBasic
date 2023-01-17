package week1;

import java.util.Scanner;

/*
        Решение квадратного уравнения.
        Даны целые числа a, b и с, определяющие квадратное уравнение.
        Вычислить корни уравнения.
        Гарантируется, что в тестовых данных у всех уравнений есть решение и их два.

        Входные данные
        a = 9 b = -96 с = 30
        Выходные данные
        x1 = 0.322 x2 = 10.344

        Входные данные
        a = 1 b = -2 с = 1
        Выходные данные
        x1 = 1.000 x2 = 1.000

        ax^2 + bx + x = 0
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
