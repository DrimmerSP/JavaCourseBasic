package HomeWork2;

import java.util.Scanner;

public class Hometask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print(str.substring(0, str.lastIndexOf(" ")) + "\n" + str.substring(str.lastIndexOf(" ") + 1));
    }
}
