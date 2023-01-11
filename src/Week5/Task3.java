package Week5;
/*
На вход подается число N — длина массива.
Затем передается массив целых чисел длины N.

Проверить, является ли он отсортированным массивом строго по убыванию.
Если да, вывести true, иначе вывести false.

5
5 4 3 2 1
->
true

2
43 46
->
false

3
5 5 5
->
false
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];
        boolean result = true;

        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] <= arr[i + 1]) {
//                result = false;
//                break;
//            }
//        }
        System.out.println(checkIfArrayDesc(arr));

    }

    public static boolean checkIfArrayDesc(int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] <= inputArray[i + 1]){
                return false;
            }
        }
        return true;
    }
}
