package HomeWork1;

import java.util.Scanner;

public class HomeTask6 {
    final static double KM_PER_MILE = 1.60934;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();

        double mile = km / KM_PER_MILE;
        System.out.println(mile);
    }
}
