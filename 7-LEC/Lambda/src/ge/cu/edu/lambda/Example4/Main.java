package ge.cu.edu.lambda.Example4;

// lambda thread example
/*
 Thread - მულტითრედინგის მაგალითი , ვქმნით 2 თრედს რომლებიც პარალელურად მუშაობენ
 */
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello :" + i + " "+ Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Runner runner = new Runner();
        Thread thread=new Thread(runner);
        thread.start();

        Runnable runner1=()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello :" + i + " "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1=new Thread(runner1);
        thread1.start();

    }
}
