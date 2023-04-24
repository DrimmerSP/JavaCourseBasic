package homeworks.basicWorks.work01.chapter3;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int min = Math.min(m, n);
        int max = Math.max(m, n);
        int sum = 0;
        for(int i = min; i <= max; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}
