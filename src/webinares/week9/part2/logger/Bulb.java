package webinares.week9.part2.logger;

public class Bulb {
    private boolean toggle;
    private final Logger logger;

    public Bulb(Logger logger) {
        this.logger = logger;
    }

    //включить метод
    public void turnOn() {
        this.toggle = true;
        logger.log("Bulb is On!");
    }

    //выключить лампу
    public void turnOff() {
        this.toggle = false;
        logger.log("Bulb is Off!");
    }

    //получить текущее состояние
    public boolean isShining() {
        logger.log("Getting information about Bulb: " + toggle);
        return this.toggle;
    }

}
