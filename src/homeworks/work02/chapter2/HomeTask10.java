package homeworks.work02.chapter2;

import java.util.Scanner;

public class HomeTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recSum(n);
    }

    public static int recSum(int num){
        if (num / 10 > 0){
            System.out.print((num % 10) + " ");
            return recSum(num / 10);
        }else {
            System.out.println(num % 10);
            return num / 10;
        }
    }
}
