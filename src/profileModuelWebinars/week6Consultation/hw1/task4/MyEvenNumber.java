package profileModuelWebinars.week6Consultation.hw1.task4;

/*
     Создать класс MyEvenNumber, который хранит четное число int n. Используя
     исключения, запретить создание инстанса MyEvenNumber с нечетным числом.
 */
public class MyEvenNumber {
    private int n;

    public MyEvenNumber(int n) {
        if (n % 2 == 0) {
            this.n = n;
        } else {
            throw new IllegalArgumentException("Not even number: " + n);
        }
    }
}
