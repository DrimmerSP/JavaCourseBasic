package webinares.profileModul.week4.streams.task1;

import webinares.profileModul.week4.functional.task2.Square;

import java.util.ArrayList;
import java.util.List;

/*
Использовать реализованный функциональный интерфейс Square на списке чисел, вывести на экран.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(10);
        Square s = (x) -> x * x;

        nums.stream()
//                .map(num -> s.calculateSquare(num))
                .map(s::calculateSquare)
                .forEach(System.out::println);

    }
}
