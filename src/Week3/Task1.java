package Week3;
/*
Проверить, является ли введенная строка корректным hex номером цвета.
Корректная строка состоит из 7 символов, первый символ “#”, далее цифры или буквы от A до F (заглавные или прописные).

Если строка является корректным hex номером цвета, то вывести true, иначе false.

#00AA12
true

00FFFF
false

#00FA
false

[0-9]{5} что искать и длина символов искомых
.matches();
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputColor = console.nextLine();

        System.out.println("Our input date: " + inputColor);
        System.out.println(inputColor.matches("#[a-fA-F0-9]{6}"));
    }
}
