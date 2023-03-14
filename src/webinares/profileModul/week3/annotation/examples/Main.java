package webinares.profileModul.week3.annotation.examples;

import java.lang.annotation.ElementType;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        ElementType


    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void suppressSet() {
        Set set = new HashSet<>();
        set.add(1);
        System.out.println(set.size());
    }

    @Deprecated
    public static void print() {

    }
}
