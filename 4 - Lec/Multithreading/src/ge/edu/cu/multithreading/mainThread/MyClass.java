package ge.edu.cu.multithreading.mainThread;

/*
 * კოდში განხილულია მეინ თრედის მეთოდების გამოძახება
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("myThread");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("wake up ");
    }
}
