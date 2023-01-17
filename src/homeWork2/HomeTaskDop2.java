package homeWork2;

import java.util.Scanner;

public class HomeTaskDop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mailPackege = scanner.nextLine();

        if (mailPackege.contains("камни!") && mailPackege.contains("запрещенная продукция")) {
            System.out.println("в посылке камни и запрещенная продукция");
        } else if (mailPackege.contains("камни!")) {
            System.out.println("камни в посылке");
        } else if (mailPackege.contains("запрещенная продукция")) {
            System.out.println("в посылке запрещенная продукция");
        } else {
            System.out.println("все ок");
        }
    }
}


