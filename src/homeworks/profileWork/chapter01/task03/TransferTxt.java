package homeworks.profileWork.chapter01.task03;

import java.io.*;

public class TransferTxt {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/homeworks/profileWork/chapter01/task03/input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/homeworks/profileWork/chapter01/task03/output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String result = line.toUpperCase();
                writer.write(result);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
