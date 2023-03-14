package week2.genericscollections.task9;

import java.util.ArrayList;
import java.util.Iterator;

/*
Удалить элемент из списка, если он нечетный.
 */
public class DeleteListElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);

        //ConcurrentModificationException
        for (Integer elem : list) {
            if (elem % 2 != 0) {
                list.remove(elem);
            }
        }

        //1 способ
        list.removeIf(integer -> integer % 2 != 0);
        //2 способ - создать копию списка и работать с ним

        //3 способ - iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 != 0) {
                iterator.remove();
            }
        }

        //4 способ (Два нечетных подряд FAIL)
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }
}
