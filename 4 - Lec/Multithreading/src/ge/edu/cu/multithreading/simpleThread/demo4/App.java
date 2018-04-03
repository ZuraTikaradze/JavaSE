package ge.edu.cu.multithreading.simpleThread.demo4;

/*
 Thread - მულტითრედინგის მაგალითი , ვქმნით 2 თრედს რომლებიც პარალელურად მუშაობენ
 */
class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi : " + i + " " + Thread.currentThread().getName());
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
        runner1.start();
        Runner runner2 = new Runner();
        runner2.start();

    }
}
