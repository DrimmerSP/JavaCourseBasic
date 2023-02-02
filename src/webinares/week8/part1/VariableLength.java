package webinares.week8.part1;

/*
    Аргументы переменной длины.
 */
public class VariableLength {

    static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static boolean findChar(Character ch, String... strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String message = "This is an integer: %d";

        System.out.println(sum(1, 3, 4));
        System.out.println(sum(1, 2));

        System.out.println(findChar('a', "python", "java"));
        System.out.println(findChar('q',"python", "java"));

        System.out.printf((message) + "%n", 123);
        System.out.println(String.format("This is an integer: %d and String: %s", 15,"1234"));

        System.out.println(String.format("Константа Фейгенбаума -  %e!",  2.502));
        System.out.println(String.format("|%-40s|", "Highload Today"));

    }

}
