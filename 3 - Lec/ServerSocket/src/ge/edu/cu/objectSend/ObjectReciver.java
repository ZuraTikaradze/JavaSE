package ge.edu.cu.objectSend;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectReciver {
    public static void main(String[] args) {

        ServerSocket serverSocket; // სერვერი
        Socket socket; // კლიენტი
        ObjectInputStream objectInputStream; // ნაკადი
        Student student;
        try {
            // სერვერის შექმნა
            serverSocket = new ServerSocket(9010);
            System.out.println("სერვერი ჩაირთო !!! ");

            // კავშირის დამყარება
            socket = serverSocket.accept();
            System.out.println("კავშირი დამყარებულია !");

            // მონაცემების წაკითხვა და ეკრანზე გამოტანა
            System.out.println("მიმდინარეობს მონაცემების წაკითხვა ...");
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            student = (Student) objectInputStream.readObject();
            System.out.println("მიღებული შეტყობინება : " + student.getName());

            // ნაკადის და სერვერის დახურვა
            objectInputStream.close();
            serverSocket.close();
            System.out.println("კავშირის დასასრული !!! ");

        } catch (Exception e) {
            System.out.println("შეცდომა :  " + e);
        }
    }
}
