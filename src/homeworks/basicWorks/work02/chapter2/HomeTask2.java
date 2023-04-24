package homeworks.basicWorks.work02.chapter2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }
        int x1 = scanner.nextInt(); //x1 = 1
        int y1 = scanner.nextInt(); //y1 = 2

        int x2 = scanner.nextInt(); //x2 = 3
        int y2 = scanner.nextInt(); //y2 = 4


        for (int i = x1; i <= x2; i++) {
            array[y1][i] = 1;
            array[y2][i] = 1;
        }

        for (int i = y1; i < y2; i++) {
            array[i][x1] = 1;
            array[i][x2] = 1;
        }

        printMatrix(array);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String line = "";
            for (int j = 0; j < matrix[0].length; j++) {
                line = line + matrix[i][j] + " ";
            }
            line = line.trim();
            System.out.println(line);
        }
    }
}
