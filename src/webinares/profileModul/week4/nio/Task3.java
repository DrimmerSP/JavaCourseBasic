package webinares.profileModul.week4.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
Копировать файл с контентом
 */
public class Task3 {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/test.txt");
        Path targetPath = Paths.get("src/target.txt");

        try {
            Path path = Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Target file path: " + path);
            System.out.println("Copied content: \n" + new String(Files.readAllBytes(path)));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
