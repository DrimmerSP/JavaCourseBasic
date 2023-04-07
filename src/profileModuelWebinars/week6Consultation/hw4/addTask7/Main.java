package week6.consultation.hw4.addTask7;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Дополнительные задачи (с собеседований)
На вход подается две строки.


Необходимо определить, можно ли уравнять эти две строки, применив только одну из трех возможных операций:
Добавить символ
Удалить символ
Заменить символ

Пример:
“cat” “cats” -> true
“cat” “cut” -> true
“cat” “nut” -> false
 */
public class Main {
    public static void main(String[] args) {
    
    
        BiPredicate<String, String> checkWords = (String word1, String word2) -> {
            int count = 0;
        
            //1. Провим можно ли добавить символ (не более 1го)
            //если символов больше 2х то возращаем false
            if (word2.length() > word1.length() + 1) {
                return false;
            }
        
            //2. Счетчик содержащий колчисетсво измененных символов (по улсовию их не более 1-го может быть)
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i)) {
                    count++;
                }
            }
        
            //3. Проверка условия.
            //Если в слове изменено более 2х букв, то false
            if (count >= 2) {
                return false;
            } else {
                return true;
            }
        };
        //На вход подается две строки согласно условию задачи
        System.out.println(checkWords.test("cat", "cats"));
        System.out.println(checkWords.test("cat", "cut"));
        System.out.println(checkWords.test("cat", "nut"));
    
    
    
    
        String s1 = "cat";
        String s2 = "cats";
        System.out.println(s1 + " -> " + s2 + " = " + check(s1, s2));
        
        String s3 = "cut";
        System.out.println(s1 + " -> " + s3 + " = " + check(s1, s3));
        
        String s4 = "nut";
        System.out.println(s1 + " -> " + s4 + " = " + check(s1, s4));
        
        String s5 = "ta";
        System.out.println(s1 + " -> " + s5 + " = " + check(s1, s5));
        
        String s6 = "catch";
        System.out.println(s1 + " -> " + s6 + " = " + check(s1, s6));
    }
    
    public static boolean check(String s1, String s2) {
        List<Character> list1 = s1.chars().mapToObj(character -> (char) character).collect(Collectors.toList());
        List<Character> list2 = s2.chars().mapToObj(character -> (char) character).collect(Collectors.toList());
        int differenceSize = list1.size() - list2.size();
        if (differenceSize == 0 || differenceSize == 1) {
            list1.removeAll(list2);
            return list1.size() == 1;
        }
        else if (differenceSize == -1) {
            list2.removeAll(list1);
            return list2.size() == 1;
        }
        else {
            return false;
        }
    }
    
    /**
     * Проверяет, отличаются ли строки на один символ
     *
     * @param word1 первая строка
     * @param word2 вторая строка
     * @return true - строки отличаются на один символ,
     * false - строки отличаются на 2 и более символа
     */
    private static boolean isDifferentByOneCharacter(String word1, String word2) {
        // Количество допустимых ошибок
        int mistakesAllowed = 1;
    
        if (word1.equals(word2)) // если первая строка равна второй, возвращаем true
        {return true;}
        
        // Проверить, что строки имеют одинаковую длину
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                // Если символ первой строки не равен символу второй строки
                if (word1.charAt(i) != word2.charAt(i)) {
                    mistakesAllowed--; // уменьшить допустимую ошибку
                    
                    if (mistakesAllowed < 0) {
                        return false;   // <--- false, поскольку ошибки
                        // превышает возможное количество
                    }
                }
            }
        }
        
        // Для случая ("cat", "catch")
        int countCharacters = Math.abs(word1.length() - word2.length());
        return countCharacters < 2;
    }
    
    static boolean check1(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (Math.abs(len1 - len2) > 1) {
            return false;
        }
        int lenMin = Math.min(len1, len2);
        IntStream intStream = IntStream.range(0, lenMin);
        int difference = Math.toIntExact(intStream.filter(i -> (str1.charAt(i) != str2.charAt(i))).count());
        return Math.abs(len1 - len2) + difference < 2;
    }
    
}
