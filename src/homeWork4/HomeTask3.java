package homeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        arr[arr.length -1] = x;
        Arrays.sort(arr);

        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x) {
                index = i;
            }
        }
        System.out.println(index);
    }
    
}
