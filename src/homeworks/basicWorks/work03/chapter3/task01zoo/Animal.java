package homeworks.basicWorks.work03.chapter3.task01zoo;

public abstract class Animal {
    public final void eat(){
        System.out.println("Кушаю. Ням-ням!");
    }
    public final void sleep(){
        System.out.println("Сплю!");
    }
    public abstract void wayOfBirth();

}
