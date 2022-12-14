package HomeWork1;

import java.util.Scanner;

public class ConvertAmountWhithSelection {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double roubles;
        int digit;

        Scanner input = new Scanner(System.in);

        //Получить сумму денег в американских долларах
        System.out.print("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();

        //Отобразить сумму денег в российских рублях с правильным окончанием
        System.out.print(dollars);

        if (5 <= dollars && dollars <=20){
            System.out.print(dollars);
        }else {
            digit = dollars % 10;

            if (digit == 1){
                System.out.print(" американский доллар равен ");
            }else  if (2<=digit && digit <= 4){
                System.out.print(" американский доллара равна ");
            }else {
                System.out.print(" американских долларов равны ");
            }
        }


        //Конвертировать сумму денег в российские рубли
        roubles = ROUBLES_PER_DOLLAR * dollars;

        //отобразить сумму денег в российских рублях в пользу покупателя
        System.out.println("она равна " + (int)(roubles * 100)/100.0 + " российского рубля.");
    }
}
