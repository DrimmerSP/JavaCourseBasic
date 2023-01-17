package homeWork1;

import java.util.Scanner;

public class Hometask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        int personBudget = scanner.nextInt();

        System.out.println(budget / personBudget);
    }
}
