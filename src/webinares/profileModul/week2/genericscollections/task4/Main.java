package week2.genericscollections.task4;

import java.util.ArrayList;
import java.util.List;

/*
Реализовать метод, который считает количество вхождений определенного элемента в переданном List

int (List <T> elements, element)
 */
public class Main {
    public static void main(String[] args) {
//        List<Boolean> list1 = new ArrayList<>();
//        list1.add(true);
//        list1.add(true);
//        list1.add(true);
//        list1.add(false);
//        System.out.println(ListUtils.countIf(list1, true));
//        System.out.println(ListUtils.countIf(list1, false));
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("abc");
//        list2.add("qqq");
//        list2.add("qwerty");
//        list2.add("qwerty");
//
//        System.out.println(ListUtils.countIf(list2, "qwerty"));
//        System.out.println(ListUtils.countIf(list2, new String("qwerty")));

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java").intern();
        String str4 = new String("Java").intern();

        System.out.println("Строка 1 равна строке 2? " + (str1 == str2));
        System.out.println("Строка 2 равна строке 3? " + (str2 == str3));
        System.out.println("Строка 3 равна строке 4? " + (str3 == str4));
    }
}
