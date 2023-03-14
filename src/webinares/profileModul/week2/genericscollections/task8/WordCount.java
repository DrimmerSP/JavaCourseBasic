package week2.genericscollections.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
На вход подается количество слов n и слова (каждое на отдельной строке).
(Scanner) - альтернатива - List<String>
Посчитать сколько раз встретилось каждое слово.
Вывести результат для каждого слова (в любом порядке).
Пример:
6
слон
слон
кот
мышь
кот
кот
->
слон 2
кот 3
мышь 1
 */
public class WordCount {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("слон");
        words.add("слон");
        words.add("слон");
        words.add("кот");
        words.add("мышь");
        words.add("кот");
        words.add("кот");
        System.out.println(getWordsCount(words));

    }

    private static Map<String, Integer> getWordsCount(List<String> words) {
        Map<String, Integer> result = new HashMap<>();
        for (String uniqWord : words) {
            int counter = 1;
            if (result.containsKey(uniqWord)) {
                // key: слон | 4
                // key: кот | 3
                // key: мышь | 2
                counter = result.get(uniqWord);
                counter++;
            }
            result.put(uniqWord, counter);
        }
        return result;
    }
}
