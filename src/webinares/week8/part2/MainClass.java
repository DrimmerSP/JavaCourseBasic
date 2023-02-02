package webinares.week8.part2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        String fileLocation = "D:\\JavaCourse\\JavaCourseBasic\\JavaCourseBasic\\src\\week8\\part2\\input2.txt";
        //OS X Path
//        String fileLocation2 = "Users/JavaCourse/JavaCourseBasic/JavaCourseBasic/src/week8/part2/input.txt";
        try {
            ReadFile.readDataFromFile(fileLocation);
        } catch (IOException e) {
            System.out.println("Возникла ошибка! " + e.getMessage());
        }

    }
}
