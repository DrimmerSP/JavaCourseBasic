package profileModuelWebinars.week4.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Создать папку и подпаку в src/
 */
public class Task2 {

    public static void main(String[] args) {
        Path path = Paths.get("src/webinares/webinares.newFolder");
        Path path2 = Paths.get("src/webinares/webinares.newFolder/newSubFolder");

        try {
            Files.createDirectory(path);
            Files.createDirectory(path2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
