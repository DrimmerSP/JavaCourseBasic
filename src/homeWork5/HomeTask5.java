package homeWork5;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        boolean flag = true;
        for (int y = 0; y < n - 1; y++) {
            for (int x = 0; x < n - y - 1; x++) {
                if (array[y][x] != array[n - x - 1][n - y - 1]){
                    flag = false;
                    break;
                }
            }
            if (!flag){
                break;
            }
        }
        System.out.println(flag);
    }
}
