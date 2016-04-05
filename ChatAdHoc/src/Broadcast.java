/**
 * Created by sander on 5-4-16.
 */
public class Broadcast implements Runnable {
    @Override
    public void run() {
        //broadcast
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }
}
