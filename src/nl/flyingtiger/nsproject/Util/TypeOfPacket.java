package nl.flyingtiger.nsproject.Util;

/**
 * Created by Jasper on 5-4-2016.
 */
public enum TypeOfPacket {


    FORWARDINGTABLE, TEXT, FILE;

    public static final int FORWARDING_TABLE_INT = 1;
    public static final int TEXT_INT = 2;
    public static final int FILE_INT = 3;


    /**
     * Return the int value of the type.
     * @return
     */
    public int typeToInt() {
        switch(this){
            case FORWARDINGTABLE:
                return FORWARDING_TABLE_INT;
            case TEXT:
                return TEXT_INT;
            case FILE;
                return FILE_INT;
        }
    }

    /**
     * Return the type corresponding to the given int.
     * @param i
     * @return
     */
    public TypeOfPacket intToType(int i){
        switch(i){
            case FORWARDING_TABLE_INT:
                return FORWARDINGTABLE;
            case TEXT_INT:
                return TEXT;
            case FILE_INT:
                return FILE;
        }

    }

}
