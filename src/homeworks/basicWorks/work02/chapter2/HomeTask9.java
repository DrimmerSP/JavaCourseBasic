package homeworks.basicWorks.work02.chapter2;

import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prints(n);
    }

    static void prints(int d) {
        int rem = d % 10;
        if (d == 0) {
            return;
        } else {
            prints(d / 10);
        }
        System.out.print(rem + " ");
    }
}
