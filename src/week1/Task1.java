package week1;

// Даны числа a, b, c. Перенести значения из a в b, из b в c, из c в a.
/*Входные данные
        3 2 1
        Выходные данные
        a = 1, b = 3,  c=2
*/


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.println("a = " + a + " b = " + b + " c = " + c);

        int buffer = c;
        c = b;
        b = a;
        a = buffer;
        System.out.println("a = " + a + " b = " + b + " c = " + c);

    }
}
