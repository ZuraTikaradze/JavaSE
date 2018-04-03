package ge.edu.cu.objectSend;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class ObjectSender {
    public static void main(String[] args) {

        Student student = new Student("Zura", 23);
        Socket socket; // კლიენტი
        ObjectOutputStream objectOutputStream; // ნაკადი
        try {
            // კლიენტის შექმნა და კავშირის დამყარება
            socket = new Socket("localhost", 9010);
            System.out.println("მიმდინარეობს კავშირის დამყარება ...");

            // ობიექტ გაგზავნა
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(student);
            System.out.println("შეტყობინება წარმატებით გაიგზავნა !!! ");

            // ნაკადის და სოკეტის დახურვა
            objectOutputStream.close();
            socket.close();
            System.out.println("კავშირის დასასრული !!!");

        } catch (Exception e) {
            System.out.println("შეცდომა : " + e);
        }

    }
}
