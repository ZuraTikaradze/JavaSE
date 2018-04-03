package ge.edu.cu.multithreading.mainThread;

import java.util.Scanner;

/*
*  კოდში განხილულია მეინ თრედის და ჩვენი პირველი თრედის ურთიერთქმედება.
*  როცა  scanner.nextLine(); ით შემოვაქვს ინფო დროებით პაუზდება მეინ თრედი, ხოლო ჩვენს მიერ შექმნილი თრედი მუშაობას აგრძელებს.
*/
class FirstThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world !!! ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        System.out.println("Enter Text : ");
        scanner.nextLine();

        System.out.println("Input succses");

        try {
            Thread.sleep(3000); // 3 wamis shemdeg gaigvidzos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Wake up");
    }
}
