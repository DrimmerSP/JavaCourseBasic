package homeworks.work01.chapter3;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int large = n / 8;
        int medium = (n % 8) / 4;
        int small = (n % 4) / 2;
        int min = (n % 2) / 1;

        System.out.println(large + " " + medium + " " + small + " " + min);
    }
}
