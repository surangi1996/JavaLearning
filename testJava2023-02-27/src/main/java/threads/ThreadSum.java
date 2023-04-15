package threads;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSum {
    public static long sum = 0;
    public static Object obj = new Object();
    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500000; i++) {
                lock.lock();
                    sum += i;
                lock.unlock();
            }
        });
        thread1.start();


        Thread thread2 = new Thread(() -> {
            for (int i = 500000; i <= 1000000; i++) {
                lock.lock();
                    sum += i;
                lock.unlock();
            }
        });
        thread2.start();

//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 500000; i++) {
//                synchronized (obj){
//                    sum += i;
//                }
//
//
//            }
//        });
//        thread1.start();
//
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 500000; i <= 1000000; i++) {
//                synchronized (obj){
//                    sum += i;
//                }
//            }
//        });
//        thread2.start();

        try {
            //Waits for this thread to die.( join() )
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(sum);


    }
}
