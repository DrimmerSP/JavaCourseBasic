package homeworks.profileWork.chapter03.additionally.dopTask02;

import java.util.Scanner;

public class TestMainBrackets {
    public static void main(String[] args) {
        String brackets;
        Scanner scanner = new Scanner(System.in);
        brackets = scanner.nextLine();
        System.out.println(AreDifferentBracketsAllowed.isValidBrackets(brackets));
    }
}
