package homeworks.work01.chapter2;

import java.util.Scanner;

public class Hometask11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = ((a+b) > c && (a+c) > b && (b+c) > a);
        System.out.println(result);
    }
}
