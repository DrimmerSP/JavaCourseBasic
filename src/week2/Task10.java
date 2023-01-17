package week2;

import java.util.Scanner;

/*
        Дана строка и паттерн, заменить паттерн на паттерн, состоящий из заглавных символов
        Входные данные:
        Hello world
        ld
        Выходные данные:
        Hello worLD
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String pattern = console.nextLine();

        System.out.println(str.replace(pattern, pattern.toUpperCase()));
    }
}
