/**
 * Created by sander on 5-4-16.
 */
public class TableEntry {
    private String nextHop;
    private int hopCount;
    private int seqNumber;


    public TableEntry(String nextHop, int hopCount, int seqNumber) {
        this.nextHop = nextHop;
        this.hopCount = hopCount;
        this.seqNumber = seqNumber;
    }

    public String getNextHop() {
        return nextHop;
    }

    public int getHopCount() {
        return hopCount;
    }

    public int getSeqNumber() {
        return seqNumber;
    }
}
