package homeworks.basicWorks.work01.chapter2;

import java.util.Scanner;

public class Hometask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 12){
            System.out.println("Пора");
        }else {
            System.out.println("Рано");
        }
    }
}
