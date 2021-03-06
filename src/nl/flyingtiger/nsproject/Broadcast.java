package nl.flyingtiger.nsproject;

/**
 * Created by sander on 5-4-16.
 */
public class Broadcast implements Runnable {
    private static final int TIME = 5;
    private Transmission trans;
    private ForwardingTable forwardingTable;

    public Broadcast(Transmission trans, ForwardingTable table) {
        this.trans = trans;
    }

    @Override
    public void run() {
        boolean isActive = true;
        while(isActive) {
            trans.send(forwardingTable.toString());

            try {
                Thread.sleep(TIME * 1000);
            } catch (InterruptedException ignored) {}
        }
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }
}
