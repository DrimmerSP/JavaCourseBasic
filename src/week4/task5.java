package week4;
/*
  Дано целое число n, n > 0. Вывести сумму всех цифр этого числа.
  92180 -> 20 //9 + 2 + 1 + 8 + 0 == 20
 */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Входные данные: " + n);
        System.out.println("Выходные данные: ");

        //case1
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            System.out.println("Sum int WHILE LOOP: " + sum);

            n /= 10;
            System.out.println("N in WHILE LOOP: " + n);
        }
        System.out.println("Answer: " + sum);

        //case2
        int total = 0;
        for (int m = console.nextInt(); m != 0 ; m /= 10) {
            total += (m % 10);
        }
        System.out.println("total: " + total);
    }
}
