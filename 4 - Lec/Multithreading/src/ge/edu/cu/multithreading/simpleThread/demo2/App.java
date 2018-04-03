package ge.edu.cu.multithreading.simpleThread.demo2;

/*
 Thread - ის შექმნა  Runnable ინტერფეისის იმპლიმენტაციით
 */
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello : " + i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runner runner=new Runner();
        Thread thread1 = new Thread(runner);
        thread1.start();
    }
}
