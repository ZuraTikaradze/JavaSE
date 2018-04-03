package ge.edu.cu.multithreading.simpleThread.demo3;

/*
  Thread - ის შექმნა ანონიმური  კლასის გამოყენებით
 */
public class App {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello : " + i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
    }
}
