package homeworks.basicWorks.work03.chapter1.task07;

/**
 * Реализовать класс TriangleChecker, статический метод которого принимает три длины сторон треугольника и
 * возвращает true, если возможно составить из них треугольник, иначе false. Входные длины сторон треугольника —
 * числа типа double. Придумать и написать в методе main несколько тестов для проверки работоспособности класса
 * (минимум один тест на результат true и один на результат false)
 */
public class TriangleChecker {
    public static void main(String[] args) {
        System.out.println("TriangleChecker должно быть true: " + triangleLenght(5,  4, 3));
        System.out.println("TriangleChecker должно быть false: " + triangleLenght(8,  4, 3));

    }
    public static boolean triangleLenght(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }
}
