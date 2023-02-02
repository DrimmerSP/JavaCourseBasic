package homeworks.work02.chapter2;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int p = scanner.nextInt();

        int xP = 0;
        int yP = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == p){
                    xP = j;
                    yP = i;
                }
            }
        }

//        int[][] arrP = new int[n - 1][ n -1];
        for (int i = 0; i < n; i++) {
            String line = "";
            if (i == yP){
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (j == xP){
                    continue;
                }
                line = line + array[i][j] + " ";
            }
            line = line.trim();
            System.out.println(line);
        }
    }
}
