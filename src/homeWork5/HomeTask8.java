package homeWork5;

import java.util.Scanner;

public class HomeTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(recSum(n));
    }

    public static int recSum(int num){
        int buff = 0;
        if (num / 10 > 0){
            buff = recSum(num / 10) + (num % 10);
        }else {
            return num % 10;
        }
        return buff;
    }
}
