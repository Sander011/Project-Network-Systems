package nl.flyingtiger.nsproject.test;

import nl.flyingtiger.nsproject.ForwardingTable;
import nl.flyingtiger.nsproject.Util.TableEntry;
import org.junit.Before;
import org.junit.Test;


import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by sander on 5-4-16.
 */
public class ForwardingTableTest {

    private ForwardingTable table;

    @Before
    public void setUp() throws Exception {
        table = new ForwardingTable();
    }


    @Test
    public void testInitialTableEntry() throws UnknownHostException {
        HashMap<String, TableEntry> forwardTable = table.getTable();
        for (Map.Entry<String, TableEntry> tableEntry : forwardTable.entrySet()) {
            assertTrue(tableEntry.getKey().equals(Inet4Address.getLocalHost().toString()));
            assertTrue(tableEntry.getValue().getNextHop().equals("0"));
            assertTrue(tableEntry.getValue().getHopCount() == 0);
            assertTrue(tableEntry.getValue().getSeqNumber() == 0);
        }
        System.out.println(table.toString());
    }

}