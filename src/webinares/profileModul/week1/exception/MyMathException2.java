package  webinares.profileModul.week1.exception;

public class MyMathException2 extends Exception {
    //extends ArithmeticException

    public MyMathException2() {
        //Можно по дефолту передавать сообщение об ошибки, если она одна и та-же.
        //super("Произошло деление на 0.")
    }

    public MyMathException2(String message) {
        super(message);
    }

    public MyMathException2(String message, Throwable throwable) {
        super(message, throwable);
    }
}
