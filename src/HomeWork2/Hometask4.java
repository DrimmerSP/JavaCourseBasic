package HomeWork2;

import java.util.Scanner;

public class Hometask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDay = scanner.nextInt();

        int restDay = 6 - numberDay;
        if (restDay == 0){
            System.out.println("Ура, выходные!");
        }
        if (restDay == -1){
            System.out.println("Ура, выходные!");
        }
        else {
            System.out.println(restDay);
        }
    }
}
