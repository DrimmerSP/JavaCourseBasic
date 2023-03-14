package homeworks.profileWork.chapter02.task01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Реализовать метод, который на вход принимает ArrayList<T>, а возвращает набор уникальных элементов этого массива.
 * Решить используя коллекции.
 */
public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);

        Set<Integer> unique = getUniqueElements(arrayList);
        System.out.println(unique);
    }

    public static <T> Set<T> getUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }
}
