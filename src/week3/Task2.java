package week3;

/*
Проверить номер карты и PIN код
На вход подается две строки: первая содержит номер карты, вторая — пинкод.
Проверить, что первая состоит из 16 цифр,
разделенных пробелом (вид XXXX XXXX XXXX XXXX, где X - цифра) и проверить,
что вторая состоит из 4 цифр.
Вывести true, если все ок, иначе false.

12345678 n345 3994
12345
false

1234 5678 9123 2322
1234
true
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cardNumber = input.nextLine();
        String code = input.nextLine();
        //XXXX XXXX XXXX XXXX, где X - цифра

        //Your code here
    }

}
