package profileModuelWebinars.week4.streams.task2;

/*
Проверить, является ли текст палиндром.
Из исходной строки с помощью стримов убрать все символы,
не являющиеся цифрой или буквой, привести к нижнему регистру.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(",aB121ba,"));
    }

    public static boolean isPalindrome(String from) {
        StringBuilder leftToRight = new StringBuilder();
        from.chars()
                .filter(Character::isLetterOrDigit)
//                .filter(c -> Character.isDigit(c) || Character.isLetter(c))
//                .filter(Character::isLetter)
//                .filter(Character::isDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint);

        System.out.println(leftToRight);
        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
        return leftToRight.toString().equals(rightToLeft.toString());
    }
}
