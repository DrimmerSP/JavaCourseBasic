package webinares.week9.part2.logger;

import webinares.week9.part2.logger.oldExample.FileLogger;

public class Main {
    public static void main(String[] args) {
//
        //Part 1
//        ConsoleLogger consoleLogger = new ConsoleLogger();
////        FileLogger fileLogger = new FileLogger();
//
//        Logger logger = new ConsoleLogger();
//        Bulb bulb = new Bulb(logger);
//
//        bulb.turnOn();
//        bulb.isShining();
//        bulb.turnOff();
//
//        Logger logger2 = new FileLogger();
//        Bulb bulb2 = new Bulb(logger2);
//
//        bulb2.turnOn();
//        bulb2.isShining();
//        bulb2.turnOff();

        //Part2
        Logger logger = new FileLoggerCsv("test_FileLoggerCsv");
        Bulb bulb = new Bulb(logger);

        bulb.turnOn();
        bulb.isShining();
        bulb.turnOff();

        Logger loggerTxt = new FileLoggerTxt("test_FileLoggerTxt");
        Bulb bulb2 = new Bulb(loggerTxt);

        bulb2.turnOn();
        bulb2.isShining();
        bulb2.turnOff();

    }
}
