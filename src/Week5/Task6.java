package Week5;
/*
   На вход подается число N - длина массива.
   Затем подается массив целых чисел из N элементов.

   Нужно циклически сдвинуть элементы на 1 влево.

   Входные данные:
   5
   1 2 3 4 7
   Выходные данные:
   2 3 4 7 1
   */

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] arr = new int[n];

        // заполняем массив входными данными
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }

        //решение через цикл
/*        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i +1];
        }
        arr[arr.length -1] = temp;
        System.out.println(Arrays.toString(arr));
        */

        //читерское решение
        int first = arr[0];
        System.arraycopy(arr,1,arr,0,arr.length -1);
        arr[arr.length -1]=first;
        System.out.println(Arrays.toString(arr));
    }
}
