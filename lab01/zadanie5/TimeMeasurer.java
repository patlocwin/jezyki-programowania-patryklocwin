package lab01.zadanie5;

public class TimeMeasurer {
    public long measureInNanoseconds(Runnable task) {
        long startTime = System.nanoTime();
        task.run();
        return System.nanoTime() - startTime;
    }
}
