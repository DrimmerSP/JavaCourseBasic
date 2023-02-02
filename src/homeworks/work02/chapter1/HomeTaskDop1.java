package homeworks.work02.chapter1;

import java.util.Random;
import java.util.Scanner;

public class HomeTaskDop1 {
    public static void main(String[] args) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_*-".toCharArray();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n < 8) {
            System.out.println("Пароль с " + n + " количеством символов небезопасен");
            n = scanner.nextInt();
        }

        String pass = "";
        for (int i = 0; i < n; i++) {
            pass = pass + chars[random.nextInt(chars.length)];
        }

        System.out.println(pass);
    }
}
