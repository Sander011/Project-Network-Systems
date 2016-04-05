package nl.flyingtiger.nsproject.Util;

import java.nio.ByteBuffer;

/**
 * Created by sander on 5-4-16.
 */
public class utils {

    public String ByteToString(byte[] bytes) {
        return ByteBuffer.wrap(bytes).asCharBuffer().toString();
    }

    public byte[] StringToByteArray(String str) {
        char[] buffer = str.toCharArray();
        return new byte[buffer.length << 1];
    }


    /**
     * Convert a byte array of variable length to a int
     * @param bytes
     * @return
     */
    public int bytesToInt(byte[] bytes) {
        int res = 0;
        for (int i = 0; i < bytes.length; i++) {
            res |= bytes[i] << ((bytes.length - 1) * 8 - (8 * i));
        }
        return res;
    }

}
