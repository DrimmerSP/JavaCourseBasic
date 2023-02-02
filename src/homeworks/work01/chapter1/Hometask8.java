package homeworks.work01.chapter1;

import java.util.Scanner;

public class Hometask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();

        double dayCash = balance / 30.0;
        System.out.println(dayCash);
    }
}
