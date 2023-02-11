package homeworks.projects.project02;

public class TestAccount {
    public static void main(String[] args) {
        /**
         * Создаём новый счёт с ID 1122 и начальным балансом в 20 000 руб.
         */
        Account account = new Account(1122, 20000);

        /**
         * Присвоим всем счетам годовую процентную ставку 4,5%
         */
        Account.setAnnualInterestRate(4.5);

        /**
         * Снимаем с этого счёта 2500руб
         */
        account.withdraw(2500);

        /**
         * Пополним этот счёт на 3000руб
         */
        account.deposit(3000);

        /**
         * Выведем баланс и ежемесячный процент в рублях, а также дату созжания счёта
         */
        System.out.println("Баланс равен " + account.getBalance() + " руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
        System.out.println("Этот счет был создан " + account.getDateCreated());
    }
}
