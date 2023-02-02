package webinares.week6;
/*
На вход подается число N — количество участников соревнования и
M — количество голосующих в жюри.
Далее в каждой из N строк (соответствующие i-му участнику) передается
по M чисел — оценка каждого жюри за i-го участника.

Необходимо вывести номер участника-победителя
(тот, кто набрал больше всех голосов).
Если таковых несколько, то вывести максимальный номер.

Важно: нумерация участников начинается с 1.

Пример:
Входные данные
3 5
5 1 4 4 5
2 2 3 2 2
5 5 5 3 5
Выходные данные
3
Входные данные
2 2
10 8
9 9
Выходные данные
2
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int[] res = new  int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i] += a[i][j];
            }
        }

        int max = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (res[i] >= max){
                max = res[i];
                idx = i;
            }
        }

        System.out.println("Победил участник под номером: " + (idx + 1));
    }
}
