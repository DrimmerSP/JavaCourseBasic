package homeworks.basicWorks.work01.chapter2;

import java.util.Scanner;

public class Hometask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Решение есть");
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Решение есть");
        } else {
            System.out.println("Решения нет");
        }
    }
}
