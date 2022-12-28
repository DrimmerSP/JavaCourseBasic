package Week4;
/*
Дано число n < 13, n > 0.
Найти факториал числа n (n! = 1 * 2 * 3 * … * (n - 1) * n)

7 -> 5040
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        //case 1
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i; // res = res * i
            System.out.println("Промежуточный результат: " + res);
        }
        System.out.println("\n Итоговый результат: " + res);

        //case 2
        int res2 = 1;
        for (int i = 1; i <= n; i++, res2 *= 1) {
            System.out.println(res2);
        }
    }
}
