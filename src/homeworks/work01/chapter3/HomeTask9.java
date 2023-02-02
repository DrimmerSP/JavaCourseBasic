package homeworks.work01.chapter3;

import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int negativeCount = 0;

        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n < 0) {
                negativeCount++;
            } else {
                break;
            }
        }
        System.out.println(negativeCount);
    }
}
