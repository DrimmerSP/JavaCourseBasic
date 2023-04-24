package homeworks.basicWorks.work01.chapter3;

import java.util.Scanner;

public class HomeTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s = "#";
        String v = " ";
        String line;
        for (int i = 1; i < n + 1; i++) {
            line = v.repeat(n - i) + s.repeat(2 * i -1);
            System.out.println(line);
        }
        line = v.repeat(n - 1) + "|";
        System.out.println(line);
    }
}
