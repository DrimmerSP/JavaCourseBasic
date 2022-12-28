package HomeWork3.coursesWork;

import java.util.Scanner;

public class workLearn7 {
    public static void main(String[ ] args) {
        String s;
        char letter_choice;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите латинскую букву от A до E: ");
            s = input.nextLine();
            letter_choice = s.charAt(0);;
        } while (letter_choice < 'A' || letter_choice > 'E');
    }
}
