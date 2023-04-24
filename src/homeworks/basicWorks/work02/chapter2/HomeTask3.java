package homeworks.basicWorks.work02.chapter2;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] array = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = "0";
            }
        }
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        array[x][y] = "K";

        if ((x - 1) >= 0 && (y - 2) >= 0){
            array[x - 1][y - 2] = "X";
        }
        if ((x + 1) < n && (y - 2) >= 0){
            array[x + 1][y - 2] = "X";
        }
        if ((x - 2) >= 0 && (y - 1) >= 0){
            array[x - 2][y - 1] = "X";
        }
        if ((x + 2) < n && (y - 1) >= 0){
            array[x + 2][y - 1] = "X";
        }
        if ((x - 2) >= 0 && (y + 1) < n){
            array[x - 2][y + 1] = "X";
        }
        if ((x + 1) < n && (y + 1) < n){
            array[x + 2][y + 1] = "X";
        }
        if ((x - 1) >= 0 && (y + 2) < n){
            array[x - 1][y + 2] = "X";
        }
        if ((x + 1) < n && (y + 2) < n){
            array[x + 1][y + 2] = "X";
        }

        printMatrix(array);
    }

    public static void printMatrix(String[][] matrix) {
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
