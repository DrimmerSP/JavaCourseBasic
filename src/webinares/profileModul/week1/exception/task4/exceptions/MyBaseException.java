package  webinares.profileModul.week1.exception.task4.exceptions;

public class MyBaseException extends RuntimeException {
    public MyBaseException(String errorMessage) {
        super(errorMessage);
        System.out.println("LOG: " + errorMessage);
    }
}
