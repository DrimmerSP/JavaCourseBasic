package HomeWork1;

import java.util.Scanner;

public class Hometask4 {
    static final int MINUTES_PER_HOUR = 60;
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int hours = (int) (count / SECONDS_PER_HOUR);
        int minutes = (int) ((count / SECONDS_PER_MINUTE) % 60);

        System.out.println(hours + " " + minutes);
    }
}
