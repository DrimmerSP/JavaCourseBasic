package homeworks.basicWorks.work01.chapter2;

import java.util.Scanner;

public class Hometask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (0 < x && x < 100 && 0 < y && y < 100 ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
