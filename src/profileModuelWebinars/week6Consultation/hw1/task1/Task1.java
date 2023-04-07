package week6.consultation.hw1.task1;

public class Task1 {
    public static void main(String[] args) {
        try {
            methodZero(0);
            methodZero(1);
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }

    public static void methodZero(int num) throws MyCheckedException {
        if (num == 0) {
            System.out.println("0");
        } else {
            throw new MyCheckedException("This is not zero!");
        }
    }
}
