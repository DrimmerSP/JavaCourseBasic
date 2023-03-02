package homeworks.profileWork.chapter01.task01;

public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
        System.out.println(message);
    }
}
