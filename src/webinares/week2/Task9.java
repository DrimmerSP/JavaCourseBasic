package webinares.week2;

import java.util.Scanner;

/*
        Дан символ, поменять со строчного на заглавный или с заглавного на строчный

        Входные данные: d
        Выходные данны: D
        Входные данные: A
        Выходные данные: a
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char c = console.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println((char) (c + ('A' - 'a')));
        } else {
            System.out.println((char) (c - ('A' - 'a')));
        }
    }
}
