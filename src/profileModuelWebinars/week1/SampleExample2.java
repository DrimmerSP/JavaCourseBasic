package profileModuelWebinars.week1;

public class SampleExample2 {
    public static void main(String[] args) throws MyMathException {
            int result = devision(55,0);
            System.out.println(result);
    }

    public static int devision(int a, int b) throws MyMathException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Возникло -> ArithmeticException");
            throw new MyMathException("Произошло деление на 0.", e);
        } finally {
            System.out.println("Hello from finally!");
        }
    }

}
