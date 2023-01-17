package homeWork2;

import java.util.Scanner;

public class Hometask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (count < 500){
            System.out.println("beginner");
            break;
        }
        while (500 <= count && count < 1500){
            System.out.println("pre-intermediate");
            break;
        }

        while (1500 <= count && count < 2500){
            System.out.println("intermediate");
            break;
        }

        while (2500 <= count && count < 3500){
            System.out.println("upper-intermediate");
            break;
        }

        while (count >= 3500){
            System.out.println("fluent");
            break;
        }
    }
}
