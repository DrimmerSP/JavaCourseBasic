package HomeWork1;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double quadratic = Math.sqrt((Math.pow(a, 2) +  Math.pow(b, 2)) / 2);
        System.out.println(quadratic);
    }
}
