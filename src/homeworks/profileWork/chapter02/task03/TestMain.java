package homeworks.profileWork.chapter02.task03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMain {
    public static void main(String[] args) {
        Set<Integer> settt1 = new HashSet<>(List.of(1, 2, 3, 12, 55));
        Set<Integer> settt2 = new HashSet<>(List.of(0, 1, 2, 4, 55));
        PowerfulSet harmony = new PowerfulSet();
        System.out.println(harmony.intersection(settt1, settt2));
        System.out.println("++++++++");
        System.out.println(harmony.union(settt1, settt2));
        System.out.println("___");
        System.out.println(harmony.relativeComplement(settt1, settt2));
    }
}
