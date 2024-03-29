package homeworks.basicWorks.projects.project02;

import java.util.ArrayList;
import java.util.Date;

/**
 * Создайте класс с именем Account для представления банковского счета
 */


public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();


    /**
     * Создаёт по умолчанию банковский счёт
     */
    public Account() {
        dateCreated = new Date();
    }

    /**
     * Создаёт банковский счёт с указанием id и balance
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    /**
     * Возвращает ID
     * */
    public int getId() {
        return id;
    }


    /**
     * Возвращает баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Возвращает годовую процентную ставку
     */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Возвращает дату создания счёта
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Присваивает новый ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Присваивает новый баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Присваивает новую годовую процентную ставку
     */
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    /**
     * Возвращает ежемесячный процент
     */
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    /**
     * Снимает со счёта указанную сумму
     */
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('-', amount, balance, ""));
    }

    /**
     * Пополняет счёт на указанную сумму
     */
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('+', amount, balance, ""));
    }



}
