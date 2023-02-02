package webinares.week4;
/*
Даны числа m < 13 и n < 7.
Вывести все степени (от 0 до n включительно) числа m с помощью цикла.
3 6
->
1
3
9
27
81
243
729
 */

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
/*
        for (int i = 1; i <= n; i++) {
            m *= i;
            System.out.println(m + " Промежуточно");
        }
        System.out.println(m);*/

        //case1
        for (int i = 0; i <= n ; i++) {
            System.out.println((int)Math.pow(m, i));
        }

        //case2
        int res = 1;
        System.out.println(res);
        for (int i = 1; i <= n; i++) {
            res = res * m;
            System.out.println(res);
        }

        //case3
        int res1 = 1;
        System.out.println(res1);
        int i = 1;
        while (i <= n){
            res *= m;
            System.out.println(res1);
            i++;
        }

        //case4
        int res2 = 1;
        int ii = 1;
        do {
            System.out.println(res2);
            res2 *= m;
            ii++;
        }while (ii <= n + 1);

    }
}
