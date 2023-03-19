package  webinares.profileModul.week1.exception.task4.exceptions;

public class MyInputException extends MyBaseException {

    public MyInputException(String errorMessage) {
        super(errorMessage);
    }
    public MyInputException() {
        super("Неправильный формат ввода.");
    }
}
