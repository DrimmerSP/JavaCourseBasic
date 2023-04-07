package profileModuelWebinars.week4.functional;

import java.security.PrivilegedAction;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        //анонимный класс

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Я только создал функциональный интерфейс");
            }
        }).start();

        //(parameter list) -> lambda body
        new Thread(() -> System.out.println("Я только создал функциональный интерфейс")).start();

//        double getPiValue() {
//            return 3.1415;
//        }

        Runnable runnable = () -> System.out.println("HELLO!");
        runnable.run();

//        () -> {
//            String s1 = "Hello";
//            String s2 = " World!";
//            return s1 + s2;
//        }
    }
}

