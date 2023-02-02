package webinares.week5;
/*
На вход подается число N — длина массива.
Затем передается массив целых чисел длины N.

Вывести элементы, стоящие на четных индексах массива.
4
20 20 11 13
->
20 11
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] arr = new int[n];

        // заполняем массив входными данными
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
            if (i % 2 == 0){
                System.out.println(arr[i]);
            }
        }


    }
}
