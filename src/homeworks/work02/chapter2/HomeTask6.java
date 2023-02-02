package homeworks.work02.chapter2;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 882
        int b = scanner.nextInt(); // 595
        int c = scanner.nextInt(); // 1232
        int k = scanner.nextInt(); // 17500
        int[][] useWeek = new int[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                useWeek[i][j] = scanner.nextInt();
            }
        }
        for (int[] item : useWeek) {
            a -= item[0];
            b -= item[1];
            c -= item[2];
            k -= item[3];
        }

        if (a < 0 || b < 0 || c < 0 || k < 0){
            System.out.println("Нужно есть поменьше");
        }else {
            System.out.println("Отлично");
        }



    }
}
