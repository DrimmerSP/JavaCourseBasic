package homeworks.basicWorks.work01.chapter3.coursesWork;
/*
    В программе SumScores для реализации цикла с сигнальной меткой используется цикл while, который суммирует баллы,
    набранные на экзаменах, независимо от их количества.
 */
import java.util.Scanner;
public class workLearn6 {
    public static void main(String[] args) {
        final int SENTINEL = -99;

        int sum, score;

        Scanner input = new Scanner(System.in);

        // Получить баллы за первый экзамен
        System.out.print("Введите баллы за первый экзамен или "
                + SENTINEL + " для выхода: ");
        score = input.nextInt();

        // До тех пор, пока не получена сигнальная метка,
        // получать баллы за следующий экзамен и накапливать их сумму
        sum = 0;
        while (score != SENTINEL) {
            sum += score;
            System.out.print("Введите баллы за следующий экзамен или "
                    + SENTINEL + " для выхода: ");
            score = input.nextInt();
        }

        // Отобразить сумму баллов за все ЕГЭ
        System.out.println("Сумма баллов за все экзамены равна " + sum);

        /*
        sum = 0;
        System.out.print("Введите баллы за первый экзамен или "
             + SENTINEL + " для выхода: ");
        for (score = input.nextInt();
             score != SENTINEL;
             score = input.nextInt()) {
          sum += score;
          System.out.print("Введите баллы за следующий экзамен или "
             + SENTINEL + " для выхода: ");
}
         */
    }

}
