package profileModuelWebinars.week1.task2;

/*
Написать Hello в output file
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileOutput {
    private static final String PKG_DIRECTORY = "src/profileModulWebinares/week1/task2/output.txt";
    private static final String OUTPUT_FILE_NAME = "output.txt";

    public static void main(String[] args) {
        try (Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)) {
            wr.write("HELLO!");
        } catch (IOException e) {
            System.out.println("LOG: " + e.getMessage());
        }

    }

}
