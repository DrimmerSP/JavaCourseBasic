package HomeWork1;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 10;
        int second = number % 10;

        System.out.println(second + "" + first);

    }
}