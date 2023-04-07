package profileModuelWebinars.week4.functional.task4;

/*
реализовать метод, чтобы вывести строку наоборот, используя наш ReverseInterface
 */
public class Main {
    public static void main(String[] args) {

        ReverseInterface reverseInterface = (String str) -> new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(reverseInterface.getReversedString("Lambda"));

        ReverseInterface reverseInterface1 = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(reverseInterface1.getReversedString("Lambda"));
    }
}
