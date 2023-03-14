package week2.genericscollections.task7;

import java.util.HashMap;
import java.util.Map;

/*
Простая задача: сохранить в мапе три элемента (1, “first”).
Вывести элемент значение по ключу 2
 */
public class MapSave {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "first");
        hashMap.put(2, "second");
        hashMap.put(3, "third");
//        hashMap.put(2, "OOOPS!!!");

        System.out.println("MAP Elements: " + hashMap);
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.keySet());
    }
}
