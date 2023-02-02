package webinares.week4;
/*
Начальный вклад в банке равен 1000.
Каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (0 < P < 25).
Найти через какое количество времени размер вклада будет больше 1100
и вывести найденное количество месяцев и итоговой размер вклада.

15 ->
1
1150.0

3 ->
4
1125.50881
 */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double precent = console.nextInt() / 100.0;
        int i = 0;
        double sum = 1000;
        for (; sum <= 1100; sum += sum * precent) {
            i++;
        }
        System.out.println("Количество месяцев: " + i);
        System.out.println("Сумма на вкладе: " +sum);

        //case2
        int p = console.nextInt();
        double start = 1000;
        double limit = 1100;
        int month = 0;

        while (start < limit){
            start += start * p / 100;
            month++;
        }
        System.out.println(month);
        System.out.println(start);
    }
}
