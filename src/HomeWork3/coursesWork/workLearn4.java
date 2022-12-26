package HomeWork3.coursesWork;

import java.util.Scanner;

public class workLearn4 {
    public static void main(String[] args) {
        int n, i, product;

        Scanner input = new Scanner(System.in);

        // Получить n
        System.out.print("Введите целое число: ");
        n = input.nextInt();

        // Вычислить n!
        product = 1;
        for (i = n; i > 1; --i)
            product *= i;

        // Отобразить n!
        System.out.println(n + "! равно " + product);
    }
    /*
        Тело цикла for выполняется с целью уменьшения значения счетчика i от n до 2, и каждое значение i включается в
        переменную-накопитель product, которая инициализируется с 1, поскольку накапливает произведение. Выход из цикла происходит при i равном 1.
     */
}
