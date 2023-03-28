package homeworks.profileWork.chapter04.task02;

import java.util.List;

public class MultiplicationOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2 , 3, 4, 5);
        int result = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}
