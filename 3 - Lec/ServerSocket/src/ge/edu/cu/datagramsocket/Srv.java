package ge.edu.cu.datagramsocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Srv {
    public static void main(String[] args) {
        DatagramSocket datagramSocket;
        DatagramPacket datagramPacket;
        String str;
        try {
            datagramSocket = new DatagramSocket(3000);
            byte[] buffer = new byte[1024];
            datagramPacket = new DatagramPacket(buffer, 1024);
            datagramSocket.receive(datagramPacket);
            str = new String(datagramPacket.getData());
            System.out.println(str);
            datagramSocket.close();
        } catch (Exception e) {

        }
    }
}
