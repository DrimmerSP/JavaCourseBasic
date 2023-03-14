package homeworks.profileWork.chapter02.task03;
/**
 * Реализовать класс PowerfulSet, в котором должны быть следующие методы:
 * <p>
 * public <T> Set<T> intersection(Set<T> set1, Set<T> set2) — возвращает пересечение двух наборов.
 * Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {1, 2}
 * <p>
 * public <T> Set<T> union(Set<T> set1, Set<T> set2) — возвращает объединение двух наборов.
 * Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {0, 1, 2, 3, 4}
 * <p>
 * public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) — возвращает элементы первого набора без тех,
 * которые находятся также и во втором наборе.
 * Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {3}
 */

import java.util.HashSet;
import java.util.Set;

public class PowerfulSet {

    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        HashSet<T> result = new HashSet<>();
        result.addAll(set1);
        result.retainAll(set2);
        return result;
    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        HashSet<T> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {
        HashSet<T> result = new HashSet<>();
        result.addAll(set1);
        result.removeAll(set2);
        return result;
    }
}
