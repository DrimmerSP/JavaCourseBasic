package week6.consultation.hw1.task3;

/*
       Реализовать метод, открывающий файл ./input.txt и сохраняющий в файл
       ./output.txt текст из input, где каждый латинский строчный символ заменен на
       соответствующий заглавный. Обязательно использование try с ресурсами.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.Scanner;


public class FileReaderAndWriter {
    private static final String PKG_DIRECTORY = "src/week6/consultation/hw1/task3/";
    private static final String OUTPUT_FILE_NAME = "output.txt";
    private static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) throws IOException {
        readAndWrite();
    }

    public static void readAndWrite() throws IOException {
        Scanner scanner = new Scanner(new File(PKG_DIRECTORY + "/" + INPUT_FILE_NAME));
        Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);

        System.out.println(Locale.getDefault());

        try (scanner; writer) {
            while (scanner.hasNext()) {
                writer.write(scanner.nextLine().toUpperCase(Locale.getDefault()) + "\n");
            }
        }
    }

}
