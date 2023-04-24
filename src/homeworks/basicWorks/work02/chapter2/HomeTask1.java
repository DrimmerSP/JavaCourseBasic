package homeworks.basicWorks.work02.chapter2;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] line = new int[n];
        int[] mins = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                line[j] = scanner.nextInt();
            }
            mins[i] = findMin(line);
        }

        for (int i = 0; i < mins.length; i++) {
            System.out.printf("%s ", mins[i]);
        }
    }

    public static int findMin(int[] array) {
        int buffMin = array[0];
        for (int j : array) {
            if (buffMin > j) {
                buffMin = j;
            }
        }
        return buffMin;
    }
}
