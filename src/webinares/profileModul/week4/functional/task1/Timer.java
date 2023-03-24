package webinares.profileModul.week4.functional.task1;

public class Timer {
    public long timeNanoSeconds;
    public void measureTime(Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        timeNanoSeconds = System.nanoTime() - startTime;
    }
}
