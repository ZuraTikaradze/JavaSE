package ge.edu.cu.SendFile;

import java.io.*;
import java.net.Socket;

public class FileSender {
    public static void main(String[] args) {
        Socket socket; // კლიენტი
        ObjectOutputStream objectOutputStream; // ნაკადი

        try {
            // კლიენტის შექმნა და კავშირის დამყარება
            socket = new Socket("localhost", 9010);
            System.out.println("მიმდინარეობს კავშირის დამყარება ...");

            // შეტყობინების გაგზავნა
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(uploadFile("C:\\Users\\ztikaradze\\Desktop\\original.gif")); // teqstis magivrad baitebis masivs vagzavni
            System.out.println("შეტყობინება წარმატებით გაიგზავნა !!! ");

            // ნაკადის და სოკეტის დახურვა
            objectOutputStream.close();
            socket.close();
            System.out.println("კავშირის დასასრული !!!");

        } catch (Exception e) {
            System.out.println("შეცდომა : " + e);
        }
    }

    public static byte[] uploadFile(String path) throws IOException {
        File file = new File(path);
        byte buffer[] = new byte[(int) file.length()];
        InputStream inputStream = new FileInputStream(file);
        inputStream.read(buffer);
        return buffer;
    }
}
