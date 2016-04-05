import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by sander on 5-4-16.
 */
public class Main {

    private final static int SOCKET_NUMBER = 2500;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main () {
        Broadcast caster = new Broadcast();
        caster.start();


        connectToGroup();
    }

    private void connectToGroup() {
        try {
            InetAddress group = InetAddress.getByName("");
            MulticastSocket socket = new MulticastSocket(SOCKET_NUMBER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
