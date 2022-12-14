package Week2;

import java.util.Scanner;

/*
Напишите систему проверки цен на номер отеля по его типу.
Считать данные из консоли о типе номера отеля (Данные вводятся в виде значения int).
1 - VIP, 2 - Premium,  3 - Comfort,  4 - Economy.
Вывести цену номера:  VIP 12500 руб., Premium 9000 руб.,  Standard 6300 руб., Economy 3800 руб.
 */
public class Task4 {
    public static void main(String[] args) {
        final  String rubleSignature = "руб;";
        Scanner console = new Scanner(System.in);
        System.out.print("Введите тип номера цифрой(1 - VIP, 2 - Premium,  3 - Comfort,  4 - Economy): ");

        int roomType = console.nextInt();

        switch (roomType){
            case 1:
                System.out.println("VIP " + 12500 + rubleSignature);
                break;
            case 2:
                System.out.println("Premium " + 9000 + rubleSignature);
                break;
            case 3:
                System.out.println("Comfort " + 6300 + rubleSignature);
                break;
            case 4:
                System.out.println("Economy " + 3800 + rubleSignature);
                break;
            default:
                System.out.println("Неизвестный тип номер! Пожалуйста введите допустимое значение: (1 - 4)");
        }
    }
}
