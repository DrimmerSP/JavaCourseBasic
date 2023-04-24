package homeworks.basicWorks.work01.chapter3;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int countLine = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                continue;
            }
            countLine++;
        }
        System.out.println(countLine);
    }
}
