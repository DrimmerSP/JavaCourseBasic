package homeworks.work03.chapter1.task04;
// Тест работоспособности:
public class MainTest {
    public static void main(String[] args) {
        TimeUnit timeUnit = new TimeUnit(5, 60, 56);
        timeUnit.printTimeIn12AmPm();
        timeUnit.printTimeIn24();
    }
}
