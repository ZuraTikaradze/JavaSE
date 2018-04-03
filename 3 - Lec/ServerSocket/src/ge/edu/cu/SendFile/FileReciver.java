package ge.edu.cu.SendFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileReciver {
    public static void main(String[] args) {
        ServerSocket serverSocket; // სერვერი
        Socket socket; // კლიენტი
        ObjectInputStream objectInputStream; // ნაკადი

        try {
            serverSocket = new ServerSocket(9010);
            System.out.println("სერვერი ჩაირთო !!! ");

            // კავშირის დამყარება
            socket = serverSocket.accept();
            System.out.println("კავშირი დამყარებულია !");

            // მონაცემების მიღება
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            saveFile("D:\\original.gif", (byte[]) objectInputStream.readObject());
            // ნაკადის და სერვერის დახურვა
            objectInputStream.close();
            serverSocket.close();
            System.out.println("კავშირის დასასრული !!! ");
        } catch (Exception e) {
            System.out.println("შეცდომა :  " + e);
        }
    }

    public static void saveFile(String path, byte[] buffer) throws IOException {
        File file = new File(path);
        OutputStream outputStream;
        outputStream = new FileOutputStream(file);
        outputStream.write(buffer);
    }
}
