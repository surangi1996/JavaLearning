package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolDummy {

    public static long sum = 0;
    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(() -> {
            for (int i = 0; i < 500000; i++) {
                lock.lock();
                sum += i;
                lock.unlock();
            }
        });
        service.submit(() -> {
            for (int i = 500000; i <= 1000000; i++) {
                lock.lock();
                sum += i;
                lock.unlock();
            }
        });
        service.shutdown();
        try {
            service.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
