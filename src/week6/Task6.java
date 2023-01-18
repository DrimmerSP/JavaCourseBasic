package week6;
/*
Петя со своей подругой хочет купить два билета в кино рядом.
Необходимо вывести на экран предзаполненные места кинотеатра и после этого проверить,
найдутся ли подходящие места для Пети и его подруги.
Подходящими местами являются два свободных места рядом в одном ряду.

На вход передается N — количество мест в одном ряду кинотеатра и M — количество рядов.
Необходимо заполнить кинотеатр размера N на M случайным заполнением (0 — свободное место, 1 — занятое).

Входные данные
3 3
Выходные данные
0 0 1
1 1 0
0 0 1
true

Входные данные
2 2
Выходные данные
1 1
1 1
false
 */

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[][] a = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(2);
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
        boolean answer = false;
        // Можно использовать метки
        // metka: for (int i = 0; i < n; i++) {
        // ....
        // brake metka;

        for (int i = 0; i < n; i++) {
            if (!answer){
                for (int j = 0; j < m-1; j++) {
                    if (a[i][j] == 0 && a[i][j + 1] == 0){
                        answer = true;
                        break;
                    }
                }
            }else {
                break;
            }
        }
        System.out.println(answer);
    }
}
