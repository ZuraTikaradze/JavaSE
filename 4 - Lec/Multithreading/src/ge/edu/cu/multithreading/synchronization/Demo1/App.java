package ge.edu.cu.multithreading.synchronization.Demo1;

/*
 *კლასში განხილულია სინქრონიზაციის და join ის მაგალითი.
 */
class Counter {

    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    counter.increment();
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    counter.increment();
                }
            }
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.count);

    }
}


