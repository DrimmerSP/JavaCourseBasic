package homeworks.work01.chapter2;

import java.util.Scanner;

public class HomeTaskDop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneModel = scanner.nextLine();
        int phonePrice = scanner.nextInt();

        if ((phoneModel.toLowerCase().contains("samsung") || phoneModel.toLowerCase().contains("iphone")) &&
                (phonePrice >= 50000 && phonePrice <= 120000)) {
            System.out.print("Можно купить");
        } else {
            System.out.print("Не подходит");
        }
    }
}
