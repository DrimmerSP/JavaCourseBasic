package week1.exception.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Необходисо корректно обработать исключение и ресурсы
 */
public class FileReader {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            ArrayList<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }

            for (String line : lines) {
                System.out.println("LINE: " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("LOG: " + e.getMessage());
        }
    }
}
