package homeworks.profileWork.chapter04.task06;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayChanges {
    public static void main(String[] args) {
        Set<Set<Integer>> sets = new HashSet<>();
        sets.add(Set.of(1, 2, 3));
        sets.add(Set.of(4, 5, 6));
        sets.add(Set.of(7, 8, 9));

        sets.forEach(System.out::print);
        System.out.println();
        changeSet(sets).forEach(System.out::print);
    }
   public static Set<Integer> changeSet(Set<Set<Integer>> setSet){
       return setSet.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   }
}
