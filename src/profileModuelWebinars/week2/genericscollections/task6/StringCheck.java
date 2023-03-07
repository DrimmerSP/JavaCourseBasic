package profileModuelWebinars.week2.genericscollections.task6;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
[С собеседований]
На вход подается строка, состоящая из маленьких латинских символов.
Проверить, что в строке встречаются все символы английского алфавита хотя бы раз:
thequickbrownfoxjumpsoverthelazydog -> true
sdfaaaa -> false
 */
public class StringCheck {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkString(str));
        System.out.println(checkString("sdfaaaa"));

        System.out.println(str.chars().distinct().count());
    }

    public static boolean checkString(String input) {
        if (Objects.isNull(input) || input.length() < 26) {
            return false;
        }
        Set<Character> set = new TreeSet<>();
        for (char ch : input.toCharArray()) {
            set.add(ch);
        }
        return set.size() == 26;
    }

}
