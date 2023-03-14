package homeworks.profileWork.chapter02.task02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С консоли на вход подается две строки s и t. Необходимо вывести true,
 * если одна строка является валидной анаграммой другой строки и false иначе.
 * <p>
 * Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы,
 * обычно с использованием всех исходных букв ровно один раз.
 */
public class Anagram {
    public static void main(String[] args) {
        String s;
        String t;
        boolean isAnagram = true;

        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        t = scanner.nextLine();

        if (s.length() != t.length()) {
            isAnagram = false;
        } else {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();

            Arrays.sort(sChars);
            Arrays.sort(tChars);

            for (int i = 0; i < sChars.length; i++) {
                if (sChars[i] != tChars[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println(isAnagram);
    }
}
