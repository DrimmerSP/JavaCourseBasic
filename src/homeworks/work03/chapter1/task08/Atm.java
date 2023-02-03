package homeworks.work03.chapter1.task08;

/**
 * Реализовать класс “банкомат” Atm.
 * Класс должен:
 * Содержать конструктор, позволяющий задать курс валют перевода долларов в рубли и курс валют перевода рублей в
 * доллары (можно выбрать и задать любые положительные значения)
 *
 * Содержать два публичных метода, которые позволяют переводить переданную сумму рублей в доллары и долларов в рубли
 *
 * Хранить приватную переменную счетчик — количество созданных инстансов класса Atm и публичный метод,
 * возвращающий этот счетчик (подсказка: реализуется через static)
 */
public class Atm {
    private double dorralrsToRubles;
    private double rublesToDollars;
    private static int instanceCount = 0;

    public Atm(double dorralrsToRubles, double rublesToDollars) {
        this.dorralrsToRubles = dorralrsToRubles;
        this.rublesToDollars = rublesToDollars;
        instanceCount++;
    }

    public double exchangeRubToDoll(double rubles){
        return rubles * rublesToDollars;
    }

    public double exchangeDollToRub(double dollars){
        return dollars * dorralrsToRubles;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
