package week3.reflection.task2;

/*
    Вывести все поля класса, их модификаторы и типы.
 */
public class Task2 {
    public static boolean a = false;
    static String b = "HELLO!";
    protected Integer i;
    private double d;

    public void setI(Integer i) {
        this.i = i;
    }
}
