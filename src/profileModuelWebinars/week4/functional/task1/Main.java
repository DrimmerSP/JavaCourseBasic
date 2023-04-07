package profileModuelWebinars.week4.functional.task1;

/*
Задача 1
Создать таймер, который считает время выполнения метода, используя Runnable.
 */
public class Main {

    public static void main(String[] args) {
        //обычный запуск
        Timer timer = new Timer();
        timer.measureTime(new SimpleSummator());
        System.out.println(timer.timeNanoSeconds);

        //Анонимный класс (Java 7)
        Timer timerAnonymous = new Timer();
        timerAnonymous.measureTime(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (long i = 1; i <= 1_000_000_000; i++) {
                    sum += 1;
                }
                System.out.println(sum);
            }
        });
        System.out.println(timerAnonymous.timeNanoSeconds);

        //Java 8 - Lambda
        Timer timerLabda = new Timer();
        timerLabda.measureTime(() -> {
            long sum = 0;
            for (long i = 1; i <= 1_000_000_000; i++) {
                sum += 1;
            }
            System.out.println(sum);
        });
        System.out.println(timerLabda.timeNanoSeconds);
    }
}
