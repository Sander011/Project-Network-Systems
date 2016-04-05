package nl.flyingtiger.nsproject;

import nl.flyingtiger.nsproject.Util.Payload;
import nl.flyingtiger.nsproject.Util.TableEntry;
import nl.flyingtiger.nsproject.Util.Utils;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sander on 5-4-16.
 */
public class ForwardingTable implements Payload {
    private String address = "";
    private Utils utils = new Utils();
    private HashMap<String, TableEntry> table = new HashMap<String, TableEntry>();

    public ForwardingTable() {
        try {
            address = Inet4Address.getLocalHost().toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        table.put(address, new TableEntry("0", 0, 0));
    }

    public HashMap getTable() {
        return this.table;
    }

    public String toString() {
        String result = "";

        for (Map.Entry<String, TableEntry> tableEntry : table.entrySet()) {
            result += tableEntry.getKey();
            result += " ";
            result += tableEntry.getValue().toString();
            result += "\n";
        }


        return result;
    }

    @Override
    public byte[] toByteArray() {
        return utils.StringToByteArray(table.toString());
    }
}
