package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /*
   На вход подается два отсортированных массива.
   Нужно создать отсортированный третий массив,
   состоящий из элементов первых двух.

   Входные данные:
   5
   1 2 3 4 7

   2
   1 6

   Выходные данные:
   1 1 2 3 4 6 7
    */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = console.nextInt();
        }
        int k = console.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = console.nextInt();
        }

        mergeTwoArraysWhithLoop(arr1, arr2);
        mergeTwoArraysWhithLoopCopy(arr1, arr2);
        mergeTwoArrays(arr1, arr2);

    }

    /**
     * Метод делает слияние отсортирваннных массивов в третий результирующий
     *
     * @param arr1 - первый массив
     * @param arr2 - второй массив
     */
    public static void mergeTwoArraysWhithLoop(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int pos = 0;

        // копируем элементы первого массива в результирующий
        for (int element : arr1) {
            mergeArray[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            mergeArray[pos] = element;
            pos++;
        }

        // сортируем
        Arrays.sort(mergeArray);

        // Выводим на экран
        System.out.println(Arrays.toString(mergeArray));
    }

    public static void mergeTwoArraysWhithLoopCopy(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergeArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeArray, arr1.length, arr2.length);

        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        //обход двух массивов
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[i]){
                mergeArray[k++] = arr1[i++];
            }else {
                mergeArray[k++] = arr2[j++];
            }
        }
        //соединяем оставшиеся элементы первого массива
        while (i < arr1.length){
            mergeArray[k++] = arr1[i++];
        }
        //соединяем оставшиеся элементы второго массива
        while (i < arr1.length){
            mergeArray[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(mergeArray));
    }

}
