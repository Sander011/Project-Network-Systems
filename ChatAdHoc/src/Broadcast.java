/**
 * Created by sander on 5-4-16.
 */
public class Broadcast implements Runnable {
    private static final int TIME = 5;
    private Transmission trans;

    public Broadcast(Transmission t) {
        this.trans = t;
    }

    @Override
    public void run() {
        //broadcast
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }
}
