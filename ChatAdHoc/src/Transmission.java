import java.net.MulticastSocket;
import java.util.Observable;

/**
 * Created by sander on 5-4-16.
 */
public class Transmission extends Observable {
    private MulticastSocket socket;
    private ForwardingTable table;

    public Transmission(MulticastSocket socket, ForwardingTable table) {
        this.socket = socket;
        this.table = table;
    }


    private void parseMessage() {

    }

    public void send(String msg) {

    }




}

