package week7.task1;

/*
Реализовать класс “Лампа”.
Методы:
- включить лампу
- выключить лампу
- получить текущее состояние
 */

public class Bulb {
    private boolean toggle;

    public Bulb() {}

    //включить метод
    public void turnOn() {
        this.toggle = true;
    }

    //выключить лампу
    public void turnOff() {
        this.toggle = false;
    }

    //получить текущее состояние
    public boolean isShining() {
        return this.toggle;
    }

}
