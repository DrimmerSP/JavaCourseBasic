package week6.consultation.hw2.task3;

/*
            Реализовать класс PowerfulSet, в котором должны быть следующие методы:
            public <T> Set<T> intersection(Set<T> set1, Set<T> set2) — возвращает пересечение двух наборов.
            Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {1, 2}


            public <T> Set<T> union(Set<T> set1, Set<T> set2) — возвращает объединение двух наборов.
            Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {0, 1, 2, 3, 4}


            public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) — возвращает элементы первого набора без тех,
            которые находятся также и во втором наборе.
            Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {3}
 */
public class PowerfulSet {

    //intersection => set1, set2 => return set1.retainAll(set2)
    //union => set1, set2 => return set1.addAll(set2)
    //relative => set1, set2 => return set1.removeAll(set2);
}
