package Week5;

/*
 На вход подается число N — длина массива.
 Затем передается отсортированный по возрастанию массив целых различных чисел из N элементов.
 После этого число M.


Найти в массиве все пары чисел, которые в сумме дают число M и вывести их на экран.
Если таких нет, то вывести -1.

5
1 2 3 4 7
5
->
1 4
2 3
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] arr = new int[n];
        boolean flag = false;

        // заполняем массив входными данными
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }

        int m = console.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == m) {
                    System.out.println(arr[i] + arr[j]);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
