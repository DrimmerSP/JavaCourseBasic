package Week1;

import java.util.Scanner;

/*
        n - число детей
        k - число конфет

        1. Вывести сколько конфет достанется каждому ребенку, если стараться делить их поровну
        2. Вывести сколько конфет останется взрослым после выдачи конфет детям

        (1) Входные данные: 5 3
        (2) Входные данные: 3 17
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество дитей: ");
        int n = console.nextInt();
        System.out.print("Теперь ведите количестко конфет: ");
        int k = console.nextInt();

//        int candy = k / n;
//        int canForParent = k - (candy * n);
//
//        System.out.println("Каждый ребёнок получит по: " + candy + " конфет. ");
//        System.out.println("А родителям достанется " + canForParent + " конфет(а) с остатка.");

          System.out.println("------------------------------------------");
        System.out.println("Всего раздали конфет: " + k / n * n + " шт");
        System.out.println("Каждому ребенку по: " + k / n + " шт");
        System.out.println("Осталось конфет для взрослых: " + k % n + " шт");
    }
}
