package homeworks.basicWorks.work01.chapter1;

import java.util.Scanner;

public class Hometask5 {
    final static double INCHES_IN_CENTIMETERS = 2.54;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inches = scanner.nextInt();

        System.out.println(inches * INCHES_IN_CENTIMETERS);
    }
}
