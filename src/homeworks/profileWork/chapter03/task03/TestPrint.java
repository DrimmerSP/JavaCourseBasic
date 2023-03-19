package homeworks.profileWork.chapter03.task03;

import java.lang.reflect.InvocationTargetException;

public class TestPrint {
    public static void main(String[] args) {
        try {
            APrinter.class.getMethod("print", int.class).invoke(new APrinter(), 15);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
