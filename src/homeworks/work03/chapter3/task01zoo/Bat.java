package homeworks.work03.chapter3.task01zoo;

public class Bat extends Mammal implements Flying{
    @Override
    public void fly() {
        System.out.println("Летаю медленно.");
    }
}
