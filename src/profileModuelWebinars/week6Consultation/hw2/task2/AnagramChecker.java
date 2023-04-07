package week6.consultation.hw2.task2;

/*
    С консоли на вход подается две строки s и t. Необходимо вывести true, если одна строка является валидной анаграммой другой строки и false иначе.
    Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы, обычно с использованием всех исходных букв ровно один раз.
 */

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(isAnagram("бейсбол", "бобслей"));
        System.out.println(isAnagram2("бейсбол", "бобслей"));
    }


    public static boolean isAnagram(String str1, String str2) {
        char[] charArr1 = str1.replace(" ", "").toCharArray();
        char[] charArr2 = str2.replace(" ", "").toCharArray();

        if (charArr1.length != charArr2.length) {
            return false;
        }

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }

    public static boolean isAnagram2(String str1, String str2) {
        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
    }
}
