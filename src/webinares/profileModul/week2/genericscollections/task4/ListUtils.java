package week2.genericscollections.task4;

import java.util.List;

/*
Реализовать метод, который считает количество вхождений определенного элемента в переданном List
 */
public class ListUtils {

    private ListUtils() {}

    public static <T> int countIf(List<T> elements, T element) {
        int counter = 0;
        for (T elem : elements) {
            //Cравнение по значению
//            if (elem.equals(element)) {
//                ++counter;
//            }

            //Сравнение по ССЫЛКИ!
            if (elem == element) {
                ++counter;
            }
        }
        return counter;
    }

}
