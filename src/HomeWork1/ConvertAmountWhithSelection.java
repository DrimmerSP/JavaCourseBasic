package HomeWork1;

import java.util.Scanner;

public class ConvertAmountWhithSelection {
    static final double ROUBLES_PER_DOLLAR = 72.12;

    public static void main(String[] args) {

        int dollars;
        double roubles;
        int digit;
        int n;
        int i;

        Scanner input = new Scanner(System.in);
        // Отобразить инструкции
        instruct();

        // Получить количество конвертаций
        // до тех пор, пока не будет введено корректное значение

        do {
            System.out.println("Введитекорректное количество конвертаций: ");
            n = input.nextInt();
        } while (n <= 0);

        // До тех пор, пока не конвертированы все суммы, получать,
        // отображать и конвертировать суммы денег в американских долларах
        // и отображать суммы денег в российских рублях.


        //Получить сумму денег в американских долларах
        System.out.print("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();

        //Отобразить сумму денег в российских рублях с правильным окончанием
        System.out.print(dollars);

        if (5 <= dollars && dollars <= 20) {
            System.out.print(dollars);
        } else {
            digit = dollars % 10;

            if (digit == 1) {
                System.out.print(" американский доллар равен ");
            } else if (2 <= digit && digit <= 4) {
                System.out.print(" американский доллара равна ");
            } else {
                System.out.print(" американских долларов равны ");
            }
        }


        //Конвертировать сумму денег в российские рубли
        roubles = finde_rubles(dollars);    // заменить на  = finde_rubles(dollar);  (ROUBLES_PER_DOLLAR * dollars;)

        //отобразить сумму денег в российских рублях в пользу покупателя
        System.out.println("она равна " + (int) (roubles * 100) / 100.0 + " российского рубля.");
    }

    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму днег " + "из американских долларов в российские рубли.");
        System.out.println("Курс покупки раен: " + ROUBLES_PER_DOLLAR + " рубля.");
    }

    /**
     * Конвертирует сумму денег из американских долларов в российские рубли.
     */
    public static double finde_rubles(int dollars) {
        return ROUBLES_PER_DOLLAR * dollars;
    }

}
