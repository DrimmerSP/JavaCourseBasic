package webinares.week3;

/*
Запросить у пользователя имя, день рождения, номер телефона, email.
Каждое из полученных ответов проверить регулярным выражением по описанным ниже правилам.
Если все введено верно, вывести “Ok”.
Если хотя бы одно из полей не соответствует - вывести “Wrong Answer” и завершить работу программы.
Проверки:
Имя
Должно содержать только буквы. Начинаться с заглавной буквы и далее только прописные.
От 2 до 20 символов.

День рождения
Должно иметь вид DD.MM.YYYY (DD, MM, YYYY - цифры, без ограничений)

Номер телефона
Должно начинаться со знака +, далее ровно 11 цифр.

Email
В начале идут прописные буквы или цифры или один из спец. символов _ - * .
Далее обязательно символ @
Далее прописные буквы или цифры
Далее точка
Далее “com” или “ru”

Albert
15.12.1990
+79151112233
albert@mail.ru
Ok

albert
15.12.1990
+79151112233
albert@mail.ru
Wrong Answer
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String date = scanner.nextLine();
        String phone = scanner.nextLine();
        String email = scanner.nextLine();

        //Your code here
    }

}
