package  webinares.profileModul.week1.exception.tryWithResourcesExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Catch block!");
            e.printStackTrace();
        } finally {
            System.out.println("finally block!");
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
