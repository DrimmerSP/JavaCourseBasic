package  webinares.profileModul.week1.exception;

public class FinallyRewriteException {
    public static void main(String[] args) throws MyMathException {
            int result = devision(55,0);
            System.out.println(result);
    }

    public static int devision(int a, int b) throws MyMathException {
        try {
            throw new MyMathException("Произошло деление на 0.");
        } catch (MyMathException e) {
            throw new RuntimeException(e);
        } finally {
            throw new IllegalArgumentException("from finally!");
        }
    }

}
