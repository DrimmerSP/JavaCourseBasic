package week2.genericscollections.task1;

/*
Создать класс Pair, который умеет хранить два значения:
1) Любого типа (K, V)
2) Одинакового типа
3) Cтрока и число только
 */
public class Main {
    public static void main(String[] args) {

//        Pair<String, String> pair1 = new Pair<>();
//        pair1.key = "One";
//        pair1.value = "Two";
//        pair1.print();

//        Pair<Integer, Integer> pair2 = new Pair<>();
//        pair2.key = 1;
//        pair2.value = 2;
//        pair2.print();

//        Pair<Integer, String> pair1 = new Pair<>();
//        pair1.key = 2;
//        pair1.value = "Two";
//        pair1.print();

        Pair<Number, String> p1 = new Pair<>(1, "apple");
        Pair<Number, String> p2 = new Pair<>(2d, "peach");
        Pair<Integer, String> p3 = new Pair<>(1, "apple");

        p1.print();
        p2.print();
        p3.print();

        System.out.println(Pair.compare(p1, p2));
//        System.out.println(Pair.compare(p1, p3));
    }
}
