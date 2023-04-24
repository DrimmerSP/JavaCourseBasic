package homeworks.basicWorks.work03.chapter3.task01zoo;

public abstract class Fish extends Animal implements Swimming{
    @Override
    public final void wayOfBirth() {
        System.out.println("Рождаюсь из икринок.");
    }

}
