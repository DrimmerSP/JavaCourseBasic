package week1.exception.tryWithResourcesExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithMultipleResources {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"));
             PrintWriter writer =  new PrintWriter(new File("testWrite.txt"))
        ) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("TryWithMultipleResources catch block!");
            throw new RuntimeException();
        }
    }
}
