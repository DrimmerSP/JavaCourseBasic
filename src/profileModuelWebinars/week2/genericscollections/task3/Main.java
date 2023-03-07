package profileModuelWebinars.week2.genericscollections.task3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 На вход подаются два сета, вывести уникальные элементы,
 которые встречаются и в первом и во втором.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(2);
        set2.add(2);
        System.out.println(set2);

        set1.retainAll(set2);
//        for (Integer value : set1) {
//            System.out.println(value);
//        }

        set1.forEach(element -> System.out.println(element));
        set1.forEach(System.out::println);

        //Вернет true если нет общих элементов в двух коллекциях
        System.out.println(Collections.disjoint(set1, set2));


    }
}
