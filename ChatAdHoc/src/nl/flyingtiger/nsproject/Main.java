package nl.flyingtiger.nsproject;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by sander on 5-4-16.
 */
public class Main {

    private final static int SOCKET_NUMBER = 2500;
    private final static String GROUP_ADDRESS = "224.43.75.410";


    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main () {
        MulticastSocket socket = null;

        try {
            InetAddress group = InetAddress.getByName(GROUP_ADDRESS);
            socket = new MulticastSocket(SOCKET_NUMBER);
            socket.joinGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ForwardingTable forwardingTable = new ForwardingTable();
        Transmission trans = new Transmission(socket, forwardingTable);

        Broadcast caster = new Broadcast(trans, forwardingTable);
        caster.start();

    }
}
