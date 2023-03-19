package  webinares.profileModul.week1.exception.task4.exceptions;

public class MyWrongOperatorException extends MyBaseException{
    public MyWrongOperatorException(String errorMessage) {
        super(errorMessage);
    }
    public MyWrongOperatorException() {
        super("Недопустимый оператор для калькулятора.");
    }
}
