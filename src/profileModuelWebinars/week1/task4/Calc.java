package profileModuelWebinars.week1.task4;

/*
Дан код простенького калькулятора. Нужно:
 - Найти места, где могут возникать исключение и проблемы
 - Обернуть такие места в try и в catch бросить кастомные исключения
 - Продумать иерархию кастомных исключений так, чтобы для них всех была псевдо-запись в лог (пока просто sout)
 */

/*
Возможные проблемы:
1. Может быть некорректный ввод чисел/символов (ошибка на input)
2. Может быть деление на 0
3. Может быть недопустимый для калькулятора ввод оператора
4. Может быть переполнение int сверху или снизу.
 */

import profileModuelWebinars.week1.task4.exceptions.MyIntOverflowException;
import profileModuelWebinars.week1.task4.exceptions.MyWrongOperatorException;
import profileModuelWebinars.week1.task4.exceptions.MyDivisionByZeroException;
import profileModuelWebinars.week1.task4.exceptions.MyInputException;

import java.util.Scanner;

public class Calc {
    private static final Scanner scanner = new Scanner(System.in);

    private int a;
    private int b;
    private char c;

    public void input() {
        try {
            a = scanner.nextInt();
            c = scanner.next().charAt(0);
            b = scanner.nextInt();
        } catch (RuntimeException e) {
            throw new MyInputException();
        }
    }

    public int calculate() {
        return switch (c) {
            case '+' -> sum();
            case '-' -> sub();
            case '/' -> integerDiv();
            case '*' -> mul();
            default -> throw new MyWrongOperatorException();
        };
    }

    private int sum() {
        try {
            // return a + b;
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverflowException();
        }
    }

    private int sub() {
        try {
            // return a - b;
            return Math.subtractExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverflowException();
        }
    }

    private int integerDiv() {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new MyDivisionByZeroException();
        }
    }

    private int mul() {
        try {
//            return a * b;
            return Math.multiplyExact(a, b);
        }  catch (ArithmeticException e) {
            throw new MyIntOverflowException();
        }
    }

}
