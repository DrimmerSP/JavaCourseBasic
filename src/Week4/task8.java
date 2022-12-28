package Week4;
/*
Дана строка s.
Вычислить количество символов в ней,
не считая пробелов (необходимо использовать цикл).

Если не спросишь, никогда не узнаешь.
Result: 32
 */

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result++;
            }

        }
        System.out.println("Result: " + result);
    }
}
