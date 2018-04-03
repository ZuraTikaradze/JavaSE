package ge.edu.cu.multithreading.simpleThread.demo1;

/*
 Thread - ის შექმნა Thread კლასის extend ით
 */
class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello : " + i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {

        Runner runner1 = new Runner();
        runner1.start(); // Run მეთოდით შევცვალო და ვაჩვენო რო  run -ი იმავე სრედზე უშვებს აპლიკაციას
    }
}
