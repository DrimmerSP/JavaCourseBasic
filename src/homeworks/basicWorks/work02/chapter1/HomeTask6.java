package homeworks.basicWorks.work02.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] symbols = new String[] {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----",
                "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};
        char[] letters = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".toCharArray();

        Map<Character, String> morze = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            morze.put(letters[i], symbols[i]);
        }

        String hut = "";
        char[] sarr = s.toUpperCase().toCharArray();
        for (int i = 0; i < sarr.length; i++) {
            hut = hut + morze.get(sarr[i]) + " ";
        }

        System.out.println(hut.trim());
    }
}
