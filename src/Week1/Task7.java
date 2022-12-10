package Week1;

import java.util.Scanner;
/*
    Дано двузначное число.
    Вывести сначала первую цифру (единицы), затем правую (десятки)

    Входные данные: 78
    Выходные: 7
              8
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int first = number / 10;
        int second = number % 10;

        System.out.println(first + " || " + second);
    }
}
