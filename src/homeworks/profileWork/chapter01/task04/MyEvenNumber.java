package homeworks.profileWork.chapter01.task04;

public class MyEvenNumber extends Exception{
    private int n;

    public MyEvenNumber(int number) {
        if(number % 2 != 0) {
            throw new IllegalArgumentException("Число должно быть положительным!");
        }
        this.n = number;
    }

    public int getN() {
        return n;
    }
}
