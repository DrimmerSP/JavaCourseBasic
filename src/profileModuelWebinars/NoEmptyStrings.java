package profileModuelWebinars;

import java.util.List;

public class NoEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = List.of("abc", "", "", "def", "qqq");
        System.out.println(strings.stream().filter(s -> !s.isEmpty()).count());
    }
}
