package webinares.week2;

import java.util.Scanner;

/*
    Даны три числа a, b, c.
    Найти сумму двух чисел больших из них.
    Входные данные
    21 0 8
    Выходные данные
    29
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        int sum;

        System.out.println(Math.max(Math.max(a+b, b+c), a+c));

//        if (a <= b && a <= c){
//            sum = b + c;
//        } else if (b <= a && b <= c) {
//            sum = a + c;
//        }else {
//            sum = a +b;
//        }
        //System.out.println(sum);
    }
}
