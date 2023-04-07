package profileModuelWebinars.week4.streams.task3;

import webinares.profileModul.week3.reflection.task1.structure.C;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Вывести количество повторений каждой строки и саму строку
 */
public class WordCount {
    public static void main(String[] args) {
        List<String> names = List.of("Sam", "James", "Elena", "James", "Joe", "Sam", "James");

        //1 способ
        Set<String> unique = new HashSet<>(names);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(names, key));
        }

        //2 способ
        Map<String, Long> frequecyMap = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequecyMap);

        //3 способ
        Map<String, Integer> counts = names.parallelStream()
                .collect(Collectors.toConcurrentMap(k -> k, v -> 1, Integer::sum));
        System.out.println(counts);

    }
}
