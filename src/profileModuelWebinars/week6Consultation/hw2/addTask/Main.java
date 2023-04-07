package week6.consultation.hw2.addTask;

/*
Реализовать метод, который принимает массив words и целое положительное число k. Необходимо вернуть k наиболее часто встречающихся слов..

Результирующий массив должен быть отсортирован по убыванию частоты встречаемого слова.
В случае одинакового количества частоты для слов, то отсортировать и выводить их по убыванию в лексикографическом порядке.

words = ["the","day","is","sunny","the","the","the","sunny","is","is","day"]

k = 4

->
["the","is","sunny","day"]

 */

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day");
        System.out.println(count(words, 4));
    }

    private static List<String> count(List<String> words, int k) {
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(reverseOrder(Map.Entry.comparingByValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
