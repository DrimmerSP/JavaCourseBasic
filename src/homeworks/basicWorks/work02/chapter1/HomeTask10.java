package homeworks.basicWorks.work02.chapter1;

import java.util.Random;
import java.util.Scanner;

public class HomeTask10 {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = random.nextInt(1001);

        int number;
        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                return;
            } else if (number == m) {
                System.out.println("Победа!");
                return;
            } else if (number > m) {
                System.out.println("Это число больше загаданного.");
            } else {
                System.out.println("Это число меньше загаданного.");
            }
        }
    }
}
