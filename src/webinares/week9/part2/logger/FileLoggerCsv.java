package webinares.week9.part2.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLoggerCsv extends FileOutputter implements Logger {
    public FileLoggerCsv(String fileName) {
//        super(fileName);
        this.fileName = fileName + getFileExtension();
    }

    public FileLoggerCsv() {
        this.fileName += getFileExtension();
    }

    public void log(String message)  {
        try (Writer writer = new FileWriter(fileName, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    String getFileExtension() {
        return ".csv";
    }
}
