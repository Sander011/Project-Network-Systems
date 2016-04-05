package nl.flyingtiger.nsproject;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.nio.charset.Charset;
import java.util.Observable;

/**
 * Created by sander on 5-4-16.
 */
public class Transmission extends Observable {
    private class Receiver extends Thread {
        private MulticastSocket socket;

        Receiver(MulticastSocket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            while (true) {
                DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
                try {
                    socket.receive(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private MulticastSocket socket;
    private ForwardingTable table;

    public Transmission(MulticastSocket socket, ForwardingTable table) {
        this.socket = socket;
        this.table = table;

        new Receiver(socket).start();
    }

    public void send(String msg) {
        byte[] msgBytes = msg.getBytes(Charset.forName("UTF-8"));
        DatagramPacket packet = new DatagramPacket(msgBytes, msgBytes.length);
        packet.setAddress(socket.getInetAddress());
        packet.setPort(socket.getPort());
        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

