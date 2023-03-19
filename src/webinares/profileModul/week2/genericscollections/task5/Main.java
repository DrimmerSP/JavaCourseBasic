package  webinares.profileModul.week2.genericscollections.task5;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("WORLD");
        set.add("java");
        set.add("_learning");
        set.add("MY");
        set.add("Hello");

        System.out.println("HashSet: ");
        for (String s : set) {
            System.out.print(s + " ");
        }

        System.out.println("\n TreeSet: ");
        TreeSet<String> setTree = ConvertHashSet.convertHashSet(set);
        for (String s : setTree) {
            System.out.print(s + " ");
        }
    }
}
