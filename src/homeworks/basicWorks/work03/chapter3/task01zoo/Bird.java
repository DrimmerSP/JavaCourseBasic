package homeworks.basicWorks.work03.chapter3.task01zoo;

public abstract class Bird extends Animal implements Flying{
    @Override
    public final void wayOfBirth() {
        System.out.println("Рождаюсь из яиц.");
    }

}
