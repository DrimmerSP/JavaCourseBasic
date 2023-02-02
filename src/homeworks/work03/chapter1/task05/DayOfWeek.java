package homeworks.work03.chapter1.task05;

/**
 * Необходимо реализовать класс DayOfWeek для хранения порядкового номера дня недели (byte) и
 * названия дня недели (String).
 * Затем в отдельном классе в методе main создать массив объектов DayOfWeek длины 7.
 * .Заполнить его соответствующими значениями (от 1 Monday до 7 Sunday) и вывести значения массива объектов DayOfWeek
 * .на экран.
 * Пример вывода:
 * 1 Monday
 * 2 Tuesday
 * …
 * 7 Sunday
 */
public class DayOfWeek {
    private byte numberOfDay;
    private String nameOfDay;

    public DayOfWeek(byte numberOfDay, String nameOfDay) {
        this.numberOfDay = numberOfDay;
        this.nameOfDay = nameOfDay;
    }

    public byte getNumberOfDay() {
        return numberOfDay;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    @Override
    public String toString() {
        return
                numberOfDay + " " + nameOfDay;
    }
}
