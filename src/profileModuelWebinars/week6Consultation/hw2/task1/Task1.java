package week6.consultation.hw2.task1;

/*
    Реализовать метод, который на вход принимает ArrayList<T>, а возвращает набор уникальных элементов этого массива. Решить используя коллекции.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 1, 2, 3, 4, 4, 5);
        List<Integer> list2 = List.of(0, 1, 1, 2, 3, 4, 4, 5);
        System.out.println(convert(list));
    }


    public static <T> Set<T> convert(List<T> sourceList) {
//        HashSet<T> res = new HashSet<>();
//        return res.addAll(sourceList);
        return new HashSet<>(sourceList);
    }
}
