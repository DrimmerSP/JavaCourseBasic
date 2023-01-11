package Week5;

/*
 На вход подается число N — длина массива.
 Затем передается массив целых чисел длины N.

  Вывести все четные элементы массива.
  Если таких элементов нет, вывести -1.

5
1 2 3 4 5
->
2 4
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] arr = new int[n];

        // заполняем массив входными данными
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }

        boolean flag = false; // нет чётных элементов

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Элемент: " + arr[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
