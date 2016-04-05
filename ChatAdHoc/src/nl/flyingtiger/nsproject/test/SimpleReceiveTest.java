package nl.flyingtiger.nsproject.test; /**
 * Created by Ties on 5-4-2016.
 */

import nl.flyingtiger.nsproject.ForwardingTable;
import nl.flyingtiger.nsproject.Transmission;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Observable;
import java.util.Observer;

public class SimpleReceiveTest {
    private class Receiver extends Thread implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg);
        }

        @Override
        public void run() {
            while (true) {
                System.out.println("hoi");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ignored) {}
            }
        }
    }
    public static final int MC_PORT = 6969;

    private ForwardingTable table;
    private Transmission transmission;
    private MulticastSocket socket;

    @Before
    public void setUp() {
        try {
            this.socket = new MulticastSocket(MC_PORT);
        } catch (IOException ignored) {}

        this.table = new ForwardingTable();
        this.transmission = new Transmission(socket, table);

        Receiver receiver = new Receiver();
        transmission.addObserver(receiver);
        receiver.start();
    }

    @Test
    private void test() {}
}
