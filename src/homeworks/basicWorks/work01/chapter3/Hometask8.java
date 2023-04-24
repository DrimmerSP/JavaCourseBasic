package homeworks.basicWorks.work01.chapter3;

import java.util.Scanner;

public class Hometask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a > p){
                sum += a;
            }
        }
        System.out.println(sum);

    }
}
