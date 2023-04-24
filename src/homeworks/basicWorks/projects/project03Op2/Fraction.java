package homeworks.basicWorks.projects.project03Op2;

public class Fraction {
    public final int numerator; // числитель
    public final int denominator; // знаменатель

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        if (denominator == 0) {
            throw new NullDenominatorException("Знаменатель объекта типа Fraction равен 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override // Переопределяет метод toString класса Object
    public String toString() {
        return numerator + "/" + denominator;
    }
}
