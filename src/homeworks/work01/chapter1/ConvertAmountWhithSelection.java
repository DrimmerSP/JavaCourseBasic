package homeworks.work01.chapter1;

import java.util.Scanner;

public class ConvertAmountWhithSelection {
    static final double ROUBLES_PER_DOLLAR = 72.12;

    public static void main(String[] args) {

        int[] dollarsArray;
        double[] roublesArray;
        int n;
      //  int i;

        Scanner input = new Scanner(System.in);
        // Отобразить инструкции
        instruct();

        // Получить количество конвертаций
        // до тех пор, пока не будет введено корректное значение

        do {
            System.out.print("Введите корректное количество конвертаций: ");
            n = input.nextInt();
        } while (n <= 0);

        // До тех пор, пока не конвертированы все суммы, получать,
        // отображать и конвертировать суммы денег в американских долларах
        // и отображать суммы денег в российских рублях.


        //Получить сумму денег в американских долларах
        System.out.print("Введите " + n + " сумм денег в американских долларах: ");
        dollarsArray = new int[n];
        for (int j = 0; j < n; j++) {
            dollarsArray[j] = input.nextInt();
        }

        //Конвертировать n сумм денег в российские рубли
        roublesArray = finde_rubles(dollarsArray, n);

        // отобразить в таблице n сумм денег в американтских долларах и
        // эквивалентные им суммы денег в российских реблях в пользу покупателя
        System.out.println("\n    Сумма, Долларов ||  Рублей ||");
        for (int j = 0; j < n; ++j) {
            System.out.println("\t\t\t\t" + dollarsArray[j] + " || " + (int)((roublesArray[j] * 100)/100.0) + " ||");
        }
    }

    /**
     * Отображает инструкцию
     */
    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму днег " + "из американских долларов в российские рубли.");
        System.out.println("Курс покупки раен: " + ROUBLES_PER_DOLLAR + " рубля. \n");
    }

    /**
     * Конвертирует n сумм денег из американских долларов в российские рубли.
     */
    public static double[] finde_rubles(int[] dollarsArray, int n) {
        double[] roublesArray = new double[n];
       // int i;
        for (int j = 0; j < n; ++j) {
            roublesArray[j] = ROUBLES_PER_DOLLAR * dollarsArray[j];
        }
        return roublesArray;
    }

}
