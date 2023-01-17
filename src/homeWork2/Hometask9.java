package homeWork2;

import java.util.Scanner;

public class Hometask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (((int)(Math.pow(Math.sin(x),2) + Math.pow(Math.cos(x), 2)) - 1 == 0)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
