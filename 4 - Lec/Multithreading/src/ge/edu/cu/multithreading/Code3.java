package ge.edu.cu.multithreading;


public class Code3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is executed the run() method");
            }
        };
        System.out.println(Thread.currentThread().getName() + " Calling the start() method of Thread");
        t.start(); // let's wait until the thread completes execution
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Calling the run() method of Thread");
        t.run();

    }
}
