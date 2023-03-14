package homeworks.projects.project03Op2;

public class TestFraction {
    public static void main(String[] args) {
        try {
            Fraction fraction = new Fraction(1, 3);
            System.out.println(fraction);
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }


    }
}
