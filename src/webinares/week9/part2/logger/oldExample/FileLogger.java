package webinares.week9.part2.logger.oldExample;

import webinares.week9.part2.logger.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLogger implements Logger {
   public void log(String message)  {
       try (Writer writer = new FileWriter("output.txt", true)) {
           writer.write(message + "\n");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

}
