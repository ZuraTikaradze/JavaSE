package ge.edu.cu.datagramsocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) {
        DatagramSocket datagramSocket;
        InetAddress ip;
        int port=3000;
        DatagramPacket datagramPacket;
        String str = "Welcome Java";
        try {
            datagramSocket = new DatagramSocket();
            ip = InetAddress.getByName("127.0.0.1");
            datagramPacket = new DatagramPacket(str.getBytes(), str.length(), ip, port);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


