package ge.edu.cu.clientsocket;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        Socket socket; // კლიენტი
        ObjectOutputStream objectOutputStream; // ნაკადი

        try {
            // კლიენტის შექმნა და კავშირის დამყარება
            socket = new Socket("localhost", 9010);
            System.out.println("მიმდინარეობს კავშირის დამყარება ...");

            // შეტყობინების გაგზავნა
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject("Hello World");
            System.out.println("შეტყობინება წარმატებით გაიგზავნა !!! ");

            // ნაკადის და სოკეტის დახურვა
            objectOutputStream.close();
            socket.close();
            System.out.println("კავშირის დასასრული !!!");

        } catch (Exception e) {
            System.out.println("შეცდომა : "+e);
        }
    }
}
