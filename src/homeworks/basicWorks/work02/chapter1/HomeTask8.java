package homeworks.basicWorks.work02.chapter1;

import java.util.Scanner;

public class HomeTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int temp = Math.abs(arr[0] - m);
        int num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int buff = temp;
            temp = Math.abs(arr[i] - m);
            if (temp < buff || (temp == buff && num < arr[i])  ){
                num = arr[i];
            }
            temp = Math.min(temp, buff);
        }

        System.out.println(num);
    }
}
