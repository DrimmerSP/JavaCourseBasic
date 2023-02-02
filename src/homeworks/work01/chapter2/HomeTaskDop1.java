package homeworks.work01.chapter2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeTaskDop1 {
    public static void main(String[] args) {
        final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[_-]).{8,}$";
        final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

        if (PASSWORD_PATTERN.matcher(password).matches()) {
            System.out.print("пароль надежный");
        }
        else {
            System.out.print("пароль не прошел проверку");
        }
    }
}
