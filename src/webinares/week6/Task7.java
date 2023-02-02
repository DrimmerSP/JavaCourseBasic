package webinares.week6;
/*
Найдем факториал числа n рекурсивно.
На вход - n
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int res = 1;
        for (int i = 1; i < n; i++) {
            res = res * i;
        }
        System.out.println("Factorial (FOR LOOP): " + res);
        System.out.println("Factorial (factorial): " + factorial(n));

    }

    // 3 -> 3*(factorial(2))  <- вернулась 1 и выполнилось действие (3*2) = 6
    // 2 -> 2*(factorial(1))  <- вернулась 1 и выполнилось действие (2*1) = 2
    // 1 -> 1
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int factorialTail(int n, int result) {
        if (n <= 1) {
            return result;
        }
        return n * factorialTail(n - 1, n * result);
    }
}
