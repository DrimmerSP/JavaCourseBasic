package profileModuelWebinars.week1.task4.exceptions;

import profileModuelWebinars.week1.task4.Calc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.input();
        System.out.println(calc.calculate());

    }

}
