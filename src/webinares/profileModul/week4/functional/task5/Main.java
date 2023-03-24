package webinares.profileModul.week4.functional.task5;

/*
Создать параметризованный функциональный интерфейс (Generics)
На выходе получить:
1) Строку наоборот
2) Факториал числа
 */
public class Main {
    public static void main(String[] args) {
        //reverse
        MySuperInterface<String> reversedString = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println(reversedString.func("Lambda"));

        MySuperInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        };
        System.out.println(factorial.func(5));
    }
}
