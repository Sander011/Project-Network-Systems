import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sander on 5-4-16.
 */
public class ForwardingTable {
    String address = "";

    HashMap<String, TableEntry> table = new HashMap<String, TableEntry>();

    public ForwardingTable() {
        try {
            address = Inet4Address.getLocalHost().toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        table.put(address, new TableEntry("0", 0, 0));
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
}
