package profileModuelWebinars.week1.task4.exceptions;

public class MyInputException extends MyBaseException {

    public MyInputException(String errorMessage) {
        super(errorMessage);
    }
    public MyInputException() {
        super("Неправильный формат ввода.");
    }
}
