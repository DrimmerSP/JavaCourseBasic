package homeWork3.coursesWork;

import java.util.Scanner;

/*
Задание

Напишите программу, которая запрашивает у пользователю строку и отображает ее в обратном порядке. Пример запуска:

Введите строку: ABCD
Обратная строка равна DCBA
 */
public class workLearn10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        System.out.println(result);
    }
}
