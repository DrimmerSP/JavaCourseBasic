package  webinares.profileModul.week1.exception;

public class SampleExample3 {
    //Работа с Multiple Exception
    public static void main(String[] args) {
        try {
            someMethodThrowArrayIndexOutOfBoundsException();
            toDivideThrowMyMathException(100, 0);
            simpleThrowRuntimeException();

            //1 вариант - общий родитель (Exception или Throwable), проблема - одинаковый текст ошибки
            // instance of - как запасной вариант решения проблемы

            //2 вариант - множественная запись исключений (catch (E1 | E2 ...))

            //3 вариант - несколько catch блоков

        } catch (MyMathException e) {
            System.out.println("LOG: Деление на 0. -> " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("LOG: Проблемы с массивом.");
        } catch (Exception e3) {
            System.out.println("LOG: Рантайм исключение.");
        }
    }


    public static void toDivideThrowMyMathException(int a, int b) throws MyMathException {
        try {
            if (a == 100) throw new MyMathException2("Тест множественной записи");
        } catch (ArithmeticException | MyMathException2 e) {
            throw new MyMathException(e.getMessage());
        }
    }

    public static void someMethodThrowArrayIndexOutOfBoundsException() {
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    public static void simpleThrowRuntimeException() {
        throw new RuntimeException();
    }
}
