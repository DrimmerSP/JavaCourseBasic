package homeworks.work03.chapter1.task01;

import java.util.Random;

/**
 * Необходимо реализовать класс Cat.
 * У класса должны быть реализованы следующие приватные методы:
 * sleep() — выводит на экран “Sleep”
 * meow() — выводит на экран “Meow”
 * eat() — выводит на экран “Eat”
 * И публичный метод:
 * status() — вызывает один из приватных методов случайным образом.
 */
public class Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.status();
    }

    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        Random random = new Random();
        int num = random.nextInt(1, 4);
        switch (num) {
            case 1:
                sleep();
                break;
            case 2:
                meow();
                break;
            case 3:
                eat();
                break;
            default:
                break;
        }
    }
}
