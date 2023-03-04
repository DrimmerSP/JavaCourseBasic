package homeworks.profileWork.chapter01.task06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormValidator {
    public static void checkName(String str){
        if ((str.length() < 2) && (str.length() > 20)){
            throw new IllegalArgumentException("Имя пользователя не верной длинны.");
        }
    }

    public static void checkBirthdate(String str) throws IllegalArgumentException{
        LocalDate birthdate;
        try {
            // Пытаемся распарсить дату из строки
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthdate = LocalDate.parse(str, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Неверный формат даты рождения");
        }

        LocalDate minDate = LocalDate.of(1900, 1, 1);
        LocalDate maxDate = LocalDate.now();
        if (birthdate.isBefore(minDate) || birthdate.isAfter(maxDate)){
            throw new IllegalArgumentException("Дата рождения должна быть не раньше 01.01.1900 и не позже текущей даты");
        }
    }

    public static void checkGender(String str){
        try {
            Gender gender = Gender.valueOf(str);
        }catch (IllegalArgumentException e){
            System.out.println("Некорректное значение пола");
        }
    }

    public static boolean checkHeight(String str) {
        try {
            double height = Double.parseDouble(str);
            if (!Double.isFinite(height) || height <= 0) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
