package homeworks.profileWork.chapter04.task04;

import java.util.List;

public class SortedNumbers {
    public static void main(String[] args) {
        List<Double> test = List.of(12.2, 5.1, 13.02, -51.2);
        sortDouble(test).forEach(System.out::println);
    }

    public static List<Double>  sortDouble(List<Double> array){
        return array.stream().sorted((o1, o2) -> o1.compareTo(o2) * -1).toList();
    }
}
