package week7;

import week7.task1.Bulb;
import week7.task2.TempType;
import week7.task2.Thermometer;
import week7.task3.Robot;
import week7.task4.FieldValidator;
import week7.task5.SimpleStack;
import week7.task7.Account;

public class MainClass {
    public static void main(String[] args) {

        //Task 1
//        Bulb lamp; //обьявление
//        Bulb lamp2; //обьявление
//        lamp = new Bulb(); // инициализация
//        lamp2 = new Bulb();
//        lamp.turnOn();
//        System.out.println("Лампочка включена? : " + lamp.isShining());
//        lamp.turnOff();
//        System.out.println("Лампочка включена? : " + lamp.isShining());

        //Task2
//        Thermometer term = new Thermometer(18.0, TempType.Celsius);
//        System.out.println("C : " + term.getTempCelsius() + " F : " + term.getTempFahrenheit());
//        Thermometer term2 = new Thermometer(130, TempType.Fahrenheit);
//        System.out.println("C : " + term2.getTempCelsius() + " F : " + term2.getTempFahrenheit());

//        //Task3
//        Robot robot = new Robot();
//        robot.go();
//        robot.go();
//        robot.go();
//        robot.printCoordinates();
//        robot.turnRight();
//        robot.go();
//        robot.go();
//        robot.turnRight();
//        robot.go();
//        robot.printCoordinates();

        //Task4
//        System.out.println(FieldValidator.validatePhone("46546545646544564564654654654654564654654"));
//        System.out.println(FieldValidator.validateEmail("qwerty@email.com"));

        //Task5
//        SimpleStack stack = new SimpleStack(3);
//        System.out.println(stack.isEmpty());
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.isFull());
//        System.out.println(stack.pop());

        //Task7

        Account.Builder accountBuilder = Account.newBuilder();
        // какие то действие
        accountBuilder.setToken("ЭТО ТОКЕН!");
        // какие то действия
        accountBuilder.setUserId("123");

        Account account = accountBuilder.build();

//        account.set();
//        account.setW();

        Account account2 = Account.newBuilder()
                .setToken("asd")
                .setUserId("345")
                .build();


    }
}
