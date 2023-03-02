package homeworks.profileWork.chapter01.task02;

public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
        System.out.println(message);
    }
}
