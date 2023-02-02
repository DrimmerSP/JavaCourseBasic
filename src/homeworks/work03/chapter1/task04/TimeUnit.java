package homeworks.work03.chapter1.task04;

/**
 * Необходимо реализовать класс TimeUnit с функционалом, описанным ниже (необходимые поля продумать самостоятельно).
 * Обязательно должны быть реализованы валидации на входные параметры.
 * Конструкторы:
 * Возможность создать TimeUnit, задав часы, минуты и секунды.
 * Возможность создать TimeUnit, задав часы и минуты. Секунды тогда должны проставиться нулевыми.
 * Возможность создать TimeUnit, задав часы. Минуты и секунды тогда должны проставиться нулевыми.
 * Публичные методы:
 * Вывести на экран установленное в классе время в формате hh:mm:ss
 * Вывести на экран установленное в классе время в 12-часовом формате (используя hh:mm:ss am/pm)
 * Метод, который прибавляет переданное время к установленному в TimeUnit
 * (на вход передаются только часы, минуты и секунды).
 */

public class TimeUnit {
    // валидация
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public TimeUnit(int hours, int minutes, int seconds) {
        addHours(hours);
        addMinutes(minutes);
        addSeconds(seconds);
    }

    public TimeUnit(int hours, int minutes) {
//        this.hours = hours;
//        this.minutes = minutes;
//        this.seconds = 0;
        new TimeUnit(hours, minutes, 0);
    }

    public TimeUnit(int hours) {
//        this.hours = hours;
//        this.minutes = 0;
//        this.seconds = 0;
        new TimeUnit(hours, 0);
    }

    public void printTimeIn24() {
        System.out.println(parseTime(hours) + ":" + parseTime(minutes) + ":" + parseTime(seconds));
    }

    public void printTimeIn12AmPm() {
        int hour12;
        if (hours > 12) {
            hour12 = hours - 12;
            System.out.println(parseTime(hour12) + ":" + parseTime(minutes) + ":" + parseTime(seconds) + " pm");
        } else {
            System.out.println(parseTime(hours) + ":" + parseTime(minutes) + ":" + parseTime(seconds) + " am");
        }
    }

    public void addTime(int hours, int minutes, int seconds) {
        addSeconds(seconds);
        addMinutes(minutes);
        addHours(hours);
    }

    private String parseTime(int item) {
        return item < 10 ? String.format("0%d", item) : String.valueOf(item);
    }

    private void addHours(int hours) {
        this.hours += hours;
        this.hours = this.hours % 24;
        while (this.hours < 0) {
            this.hours += 24;
        }
    }

    private void addMinutes(int minutes) {
        this.minutes += minutes;
        addHours(this.minutes / 60);
        this.minutes = this.minutes % 60;
        if (this.minutes < 0) {
            this.minutes += 60;
        }
    }

    private void addSeconds(int sec) {
        this.seconds += sec;
        addMinutes(this.seconds / 60);
        this.seconds = this.seconds % 60;
        if (this.seconds < 0) {
            this.seconds += 60;
        }
    }

}
