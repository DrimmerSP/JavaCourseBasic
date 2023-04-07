package profileModuelWebinars.week4.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
Переместить файл в папку
 */
public class Task4 {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/target.txt");
        Path targetPath = Paths.get("src/webinares.newFolder/target.txt");

        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
