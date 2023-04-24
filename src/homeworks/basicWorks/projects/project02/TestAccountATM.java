package homeworks.basicWorks.projects.project02;

import java.util.Scanner;

public class TestAccountATM {
    private static Scanner input = new Scanner(System.in);
    private Account[] accounts = new Account[10];

    /**
     * Создаёт объект банкомат с 10-ю банковскими счетами,
     * с заполненным ID и балансом.
     */
    public TestAccountATM() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 10000);
        }
    }

    public static void main(String[] args) {
        TestAccountATM accountATM = new TestAccountATM();
        int id;
        while (true){
            System.out.println("Введите id: ");
            id = input.nextInt();
            if (id < 0 || id > accountATM.accounts.length){
                System.out.println("Введите, пожалуйста, корректный ID");
                continue;
            }
            /**
             * цикл по выполнению действия с выбранным счетом:
             */
            while (true) {
                int choice = accountATM.getMenuSelection();
                if (choice == 1)
                    System.out.println("Баланс равен " + accountATM.accounts[id].getBalance());
                else if (choice == 2)
                    accountATM.withdraw(id);
                else if (choice == 3)
                    accountATM.deposit(id);
                else
                    break;
            }
        }
    }

    /**
     * Отображает меню и получает оди из его пунктов:
     */
    public int getMenuSelection() {
        int choice;

        while (true) {
            System.out.println("\nОсновное меню");
            System.out.println("1: проверить баланс счета");
            System.out.println("2: снять со счета");
            System.out.println("3: положить на счет");
            System.out.println("4: выйти");
            System.out.print("Введите пункт меню: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Вы ввели некорректный пункт меню!");
            }
            else {
                break;
            }
        }
        return choice;
    }

    /**
     * снимает с выбранного счета указанную сумму:
     */
    public void withdraw(int id) {
        System.out.print("Введите сумму для снятия со счета: ");
        double amount = input.nextDouble();
        if (amount < 0) {
            System.out.print("Сумма отрицательная! Операция отменена.");
        } else if (amount <= accounts[id].getBalance()) {
            accounts[id].withdraw(amount);
        } else {
            System.out.print("Недостаточно средств на счете! Операция отменена.");
        }
    }

    /**
     * пополняет выбранный счет на указанную сумму:
     */
    public void deposit(int id) {
        System.out.print("Введите сумму для внесения на счет: ");
        double amount = input.nextDouble();
        if (amount >= 0) {
            accounts[id].deposit(amount);
        }
        else {
            System.out.print("Сумма отрицательная! Операция отменена.");
        }
    }


}
