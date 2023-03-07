package profileModuelWebinars.week2.genericscollections.task5;

import java.util.HashSet;
import java.util.TreeSet;

/*
Создать метод, переводящий из HashSet в TreeSet. Вывести оба варианта.
 */
public class ConvertHashSet {
    private ConvertHashSet() {
    }

    public static <T> TreeSet<T> convertHashSet(HashSet<T> from) {
//        TreeSet<T> result = new TreeSet<>(from);
//        result.addAll(from);
//        for (T element : from) {
//            result.add(element);
//        }
        return new TreeSet<>(from);
    }
}
