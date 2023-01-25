package week7.task4;

/*
Класс для валидаций полей регуляркой.
Вспоминаем задачу по регуляркам, рассказываем про статические объекты:

Имя
Должно содержать только буквы. Начинаться с заглавной буквы и далее только прописные. От 2 до 20 символов.

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
 */

import java.util.regex.Pattern;

public class FieldValidator {
    private static final Pattern NAME_PATTERN = Pattern.compile("([A-Z][a-z]{1,19})");
    private static final Pattern DATE_PATTERN = Pattern.compile("([0-9]{2}\\.[0-9]{2}\\.[0-9]{4})");
    private static final Pattern PHONE_PATTERN = Pattern.compile("\\+([0-9]{11})");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("[A-Za-z0-9\\-\\_\\*\\.]+@[a-z0-9]+\\.(com|ru)");

    public static boolean validateName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    public static boolean validateDate(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }

    public static boolean validatePhone(String phone) {
        return PHONE_PATTERN.matcher(phone).matches();
    }

    public static boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    //ВАЖНО!!! Не забывать в утилитарных классах запрещать создание экземпляра!
    private FieldValidator() {}
}
