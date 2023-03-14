package homeworks.profileWork.chapter02.additionally.dopTask01;
/**
 * Реализовать метод, который принимает массив words и целое положительное число k.
 * Необходимо вернуть k наиболее часто встречающихся слов..
 *
 * Результирующий массив должен быть отсортирован по убыванию частоты встречаемого слова.
 * В случае одинакового количества частоты для слов, то отсортировать и выводить их по убыванию в
 * лексикографическом порядке.
 *
 * Ввод данных:                                                                      Вывод:
 * words = ["the","day","is","sunny","the","the","the","sunny","is","is","day"]      ["the","is","sunny","day"]
 *
 * k = 4
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Additionally {
    public static List<String> SortWords(String[] words, int k) {
        HashMap<String, Integer> result = new HashMap<>();

        for (String item : words) {
            if (result.containsKey(item)){
                int n = result.get(item);
                n++;
                result.put(item, n);
            }else {
                result.put(item, 1);
            }
        }

        List<String> wordList = new ArrayList<>(result.keySet());

        wordList.sort((w1, w2) ->
                result.get(w1).equals(result.get(w2)) ? w1.compareTo(w2) : result.get(w2) - result.get(w1));
        return wordList.subList(0, k);
    }

    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day"};
        int k = 4;

        List<String> topWordCount = SortWords(words, k);
        System.out.println(topWordCount);
    }
}
