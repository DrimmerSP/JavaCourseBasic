package homeworks.basicWorks.work01.chapter3;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.toCharArray()[i]);
        }

    }
}
