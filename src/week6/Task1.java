package week6;
/*
На вход передается N — высота двумерного массива и M — его ширина.
Затем передается сам массив.
Необходимо сохранить в одномерном массиве суммы чисел каждого столбца и вывести их на экран.
Пример:
Входные данные
2 2
10 20
5 7
Выходные данные
15 27
Входные данные
3 1
30
42
15
Выходные данные
87
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        // Заполняем массив
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int[] res = new int[m];

        // Подсчёт суммы
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += array[j][i];
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
