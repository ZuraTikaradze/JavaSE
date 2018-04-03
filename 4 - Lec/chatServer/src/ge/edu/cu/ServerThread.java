package ge.edu.cu;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket client;
    private  int clientID;
    private boolean running = true;

    public ServerThread(Socket client, int clientID) {
        this.client = client;
        this.clientID = clientID;
    }

    @Override
    public void run() {
        System.out.println("დავაკშირებული კლიენტის: ID - " + clientID + " : მისამართი - " + client.getInetAddress().getHostName());

        try {
            // მონაცემების წაკითხვა და ეკრანზე გამოტანა
            System.out.println("მიმდინარეობს მონაცემების წაკითხვა ...");
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
            String str = (String) objectInputStream.readObject();
            System.out.println("მიღებული შეტყობინება : " + str);

//            // ნაკადის და სერვერის დახურვა
//            objectInputStream.close();
            System.out.println("კავშირის დასასრული !!! ");
        } catch (Exception e) {
            System.out.println("მოხდა შეცდომა : " + e);
        }
    }
}
