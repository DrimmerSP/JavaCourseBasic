package webinares.profileModul.week1.exception.task4.exceptions;

import webinares.profileModul.week1.exception.task4.Calc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.input();
        System.out.println(calc.calculate());

    }

}
