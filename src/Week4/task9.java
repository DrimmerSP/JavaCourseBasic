package Week4;
/*
 Дана последовательность из n целых чисел, которая может начинаться с
    отрицательного числа. Определить, какое количество отрицательных чисел
    записано в начале последовательности и прекратить выполнение программы
    при получении первого неотрицательного числа на вход.
Входные данные:
-1
-2
4
Выходные данные:
Result: 2
 */

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        //case1
        Scanner console = new Scanner(System.in);
        int res = 0;
        while (true){
            if (console.nextInt() < 0){
                res++;
            }else  break;
        }
        System.out.println(res);

        //case2
        int count = 0;
        for (int i = console.nextInt(); i < 0; i = console.nextInt()) {
            count++;
        }
        System.out.println("result: " + count);

    }
}
