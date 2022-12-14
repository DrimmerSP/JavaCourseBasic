package Week2;

import java.util.Scanner;

/*
Дана последовательность символов, конкатенировать их в одну строку и вывести эту строку, исключая цифры.
На вход подаются заглавные или строчные символы английского алфавита или цифры.

Входные данные
H 1 9 i 4
Выходные данные
Hi
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char s1 = console.next().charAt(0);
        char s2 = console.next().charAt(0);
        char s3 = console.next().charAt(0);
        char s4 = console.next().charAt(0);
        char s5 = console.next().charAt(0);

        String str ="";
        if ((s1 >= 'a' && s1 <= 'z') || (s1 >= 'A' && s1 <= 'Z')) {
            str += s1;
        }
        if ((s2 >= 'a' && s2 <= 'z') || (s2 >= 'A' && s2 <= 'Z')) {
            str += s2;
        }
        if ((s3 >= 'a' && s3 <= 'z') || (s3 >= 'A' && s3 <= 'Z')) {
            str += s3;
        }
        if ((s4 >= 'a' && s4 <= 'z') || (s4 >= 'A' && s4 <= 'Z')) {
            str += s4;
        }
        if ((s5 >= 'a' && s5 <= 'z') || (s5 >= 'A' && s5 <= 'Z')) {
            str += s5;
        }
        System.out.println(str);
    }
}
