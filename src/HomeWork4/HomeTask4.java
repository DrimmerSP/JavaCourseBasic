package HomeWork4;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count;
        for (i = 0; i < arr.length; i++) {
            count = 0;
            for (var j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(count + " " + arr[i]);
        }
    }
}
//TODO
//решить проблему подсчёта