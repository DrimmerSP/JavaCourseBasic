package homeworks.profileWork.chapter04.task05;

import java.util.List;

public class CapitalLetters {
    public static void main(String[] args) {
        List<String> letters = List.of("abc", "def", "qqq");

        List<StringBuilder> newLetter = letters.stream()
                .map(s -> s.toUpperCase() + ", ")
                .map(StringBuilder::new)
                .toList();
        newLetter.get(newLetter.size() -1).setLength(newLetter.get(newLetter.size() -1).length() -2);
        newLetter.forEach(System.out::print);
    }
}
