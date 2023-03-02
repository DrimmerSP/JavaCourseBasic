package profileModuelWebinars.week1;

public class MyMathException extends Exception {
    //extends ArithmeticException

    public MyMathException() {
        //Можно по дефолту передавать сообщение об ошибки, если она одна и та-же.
        //super("Произошло деление на 0.")
    }

    public MyMathException(String message) {
        super(message);
    }

    public MyMathException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
