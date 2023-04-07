package week6.consultation.hw4;

/*
    На вход подается список строк. Необходимо вывести количество непустых строк в списке.
    Например, для List.of("abc", "", "", "def", "qqq") результат равен 3.
 */

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "", "", "def", "qqq");

        System.out.println(calc(list));

        List<String> input = List.of("abc", "", "", "def", "qqq");

        //Решение Константина
        List<String> filtered = input.stream()
                .filter(Objects::nonNull)
                .filter(Predicate.not(String::isBlank))
                .toList();

        System.out.println((long) filtered.size());

        //Решение Анатолия
        Integer count = (int) Stream.of("abc", "", "", "def", "qqq")
                .filter((element) -> element.length() != 0)
                .count();

        //Решение Екатерины
       Long count2 =  Stream.of("abc", "", "", "def", "qqq")
                .filter(s -> !s.isEmpty()).count();

    }

    private static long calc(List<String> list) {
        return list.stream()
                .filter(Predicate.not(String::isBlank)).count();
    }
}
