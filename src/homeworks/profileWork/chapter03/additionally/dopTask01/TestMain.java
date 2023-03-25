package homeworks.profileWork.chapter03.additionally.dopTask01;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        String parentheses;
        Scanner scanner = new Scanner(System.in);
        parentheses = scanner.nextLine();
        System.out.println(IsSimpleValidParentheses.validParentheses(parentheses));
    }
}
