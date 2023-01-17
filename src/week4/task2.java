package week4;
/*
Даны два числа m и n.
Найти произведение чисел в диапазоне между m и n включительно.
(m < 14 и n < 14), m < n

4 12 -> 79833600
3 7 -> 2520

 */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();

        int res = 1;
        for (int i = m; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
