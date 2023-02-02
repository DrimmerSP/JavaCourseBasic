package webinares.week4;
/*
На вход подается число n и последовательность целых чисел длины n.
Вывести два максимальных числа в этой последовательности без использования массивов.
5
1 3 5 4 5 -> 5 5
 */

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();

        int firstMax = Math.max(firstNumber, secondNumber);
        int secondMax = Math.max(firstNumber, secondNumber);

        for (int i = 2; i < n; i++) {
            int k = console.nextInt();
            if (k > firstMax){
                secondMax = firstMax;
                firstMax = k;
            } else if (k > secondMax) {
                secondMax = k;
            }
        }
        System.out.println(firstMax + "" + secondMax);
    }
}
