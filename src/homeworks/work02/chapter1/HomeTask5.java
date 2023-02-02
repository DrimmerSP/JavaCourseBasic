package homeworks.work02.chapter1;

import java.util.Scanner;

public class HomeTask5 {
    //HomeTask5
    // Сдвиг массива
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        arr = shift(arr, m);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] shift(int[] array, int m) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int index = i + m;
            if (index >= array.length){
                index = index - array.length;
            }
            result [index] = array[i];

        }
        return result;
    }
}

