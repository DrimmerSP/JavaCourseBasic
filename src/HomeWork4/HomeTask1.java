package HomeWork4;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Double[] arr = new Double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        for (double item : arr) {
            sum += item;
        }
        System.out.println(sum / n);

    }
}
