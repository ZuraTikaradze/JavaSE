package ge.edu.cu;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        ServerSocket serverSocket; // სერვერი
        Socket socket = null; // კლიენტი
        ObjectInputStream objectInputStream; // ნაკადი
        String str; // მიღებული მონაცემი
        int clientId = 0;
        ServerThread serverThread;


        try {
            // სერვერის შექმნა
            serverSocket = new ServerSocket(9011);
            System.out.println("სერვერი ჩაირთო !!! ");

            while (true) {
                // კავშირის დამყარება
                socket = serverSocket.accept();
                serverThread = new ServerThread(socket, clientId);
                serverThread.start();
                System.out.println("კავშირი დამყარებულია !");
                clientId++;
            }

        } catch (Exception e) {
            System.out.println("შეცდომა :  " + e);
        }
    }
}
