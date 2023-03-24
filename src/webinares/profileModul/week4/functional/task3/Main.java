package webinares.profileModul.week4.functional.task3;

/*
получить значение PI через собственный функциональный интерфейс
 */
public class Main {
    public static void main(String[] args) {
        MyInterface myInterface;
        myInterface = () -> Math.PI;

        System.out.println(myInterface.getPiValue());

        MyInterface myInterface1 = () -> 3.14;
        System.out.println(myInterface1.getPiValue());

    }
}
