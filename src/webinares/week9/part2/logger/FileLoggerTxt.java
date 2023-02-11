package webinares.week9.part2.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLoggerTxt
        extends FileOutputter
        implements Logger {

//    private final String fileName;

    public FileLoggerTxt(String fileName) {
//        super(fileName);
        this.fileName = fileName + getFileExtension();
    }

    public FileLoggerTxt() {
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
        return ".txt";
    }
}
