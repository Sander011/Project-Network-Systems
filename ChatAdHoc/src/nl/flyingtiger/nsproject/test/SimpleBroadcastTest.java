package nl.flyingtiger.nsproject.test; /**
 * Created by Ties on 5-4-2016.
 */

import nl.flyingtiger.nsproject.Broadcast;
import nl.flyingtiger.nsproject.ForwardingTable;
import nl.flyingtiger.nsproject.Transmission;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MulticastSocket;

public class SimpleBroadcastTest {
    public static final int MC_PORT = 6969;

    private ForwardingTable table;
    private Transmission transmission;
    private MulticastSocket socket;
    private Broadcast broadcast;
    
    @Before
    public void setUp() {
        try {
            this.socket = new MulticastSocket(MC_PORT);
        } catch (IOException ignored) {}

        this.table = new ForwardingTable();
        this.transmission = new Transmission(socket, table);
        this.broadcast = new Broadcast(transmission, table);
    }
    
    @Test
    public void test() {
        transmission.send("hoi broertjes!!");
    }
    
}
