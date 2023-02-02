package webinares.week6;
/*
На вход подается число N — ширина и высота матрицы.
Затем передается сама матрица, состоящая из натуральных чисел.
После этого передается натуральное число P.

Необходимо найти в матрице число P и занулить строку и столбец,
в котором это число находится (кроме числа P).
Применить эту операцию ко всем найденным числам P.

Пример:
Входные данные
3
1 2 3
1 5 3
1 2 3
5
Выходные данные
1 0 3
0 5 0
1 0 3

Входные данные
7
1 2 3 4 5 6 7
8 9 8 7 6 5 4
3 2 1 2 3 4 5
6 7 8 9 8 7 6
6 5 4 3 2 1 2
3 4 5 6 7 8 9
8 7 6 5 4 3 2
9
Выходные данные
1 0 3 0 5 6 0
0 9 0 0 0 0 0
3 0 1 0 3 4 0
0 0 0 9 0 0 0
6 0 4 0 2 1 0
0 0 0 0 0 0 9
8 0 6 0 4 3 0
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int p = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == p) {
                    fillWithZero(arr, n, i, j, p);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillWithZero(int[][] arr, int n, int iIndx, int jInd, int p) {
        for (int k = 0; k < n; k++) {
            System.out.println("a[k][jind]: " + arr[k][jInd]);
            if (arr[k][jInd] != p) {
                arr[k][jInd] = 0;
            }

            System.out.println("arr[iIndx][k]: " + arr[k][jInd]);
            if (arr[iIndx][k] != p) {
                arr[iIndx][k] = 0;
            }
        }
        System.out.println("-------------------------------------------------");
    }
}

