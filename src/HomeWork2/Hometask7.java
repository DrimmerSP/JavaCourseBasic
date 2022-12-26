package HomeWork2;

import java.util.Scanner;

public class Hometask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str.substring(0, str.indexOf(" ")));
        System.out.println(str.substring(str.indexOf(" ") + 1, str.length()));
    }
}
