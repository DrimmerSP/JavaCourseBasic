package webinares.week2;

import java.util.Scanner;

/*
        Реализовать System.out.println(), используя System.out.print() и табуляцию \n
        Входные данные: два слова, считываемые из консоли

        Входные данные
        Hello World
        Выходные данные
        Hello
        World
 */
public class Task8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        System.out.println(first + "/n" + second);
    }
}
