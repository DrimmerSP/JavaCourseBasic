package webinares.week8.part2;

import webinares.week8.part1.WeekDays;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
Читаем данные из файла
В файле у нас будут дни недели текстом
Результат пишем в output.txt файл
 */
public class ReadFile {
    private static final String PKG_DIRECTORY = "D:/JavaCourse/JavaCourseBasic/JavaCourseBasic/src/week8/part2";
    private static final String OUTPUT_FILE_NAME = "output.txt";
    private ReadFile() {}

    public static void readDataFromFile(String filePath) throws IOException {
        Scanner scanner = new Scanner(new File(filePath));
        String[] days = new String[10];
        int i = 0;
        while (scanner.hasNextLine()) {
            days[i++] = scanner.nextLine();
        }

        Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);
        for (int j = 0; j < i; j++) {
            String res = "Порядковый номер для дня недели: " + days[j] + " равен: "
                    + WeekDays.ofName(days[j]).getDayNumber() + "\n";
            writer.write(res);
        }

        writer.close();
        scanner.close();

        //Пример try with resources (Closable интерфейс) -> Не надо явно закрывать!
        //try(Writer w = new FileWriter("")) {}

    }
}
