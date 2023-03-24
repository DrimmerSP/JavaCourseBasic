package webinares.profileModul.week4.nio;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Прочитать и вывести содержимое файла с помощью NIO и newBufferedReader:
 */
public class Task5 {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            //Charset.forName("UTF-8");
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
