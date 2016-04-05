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

}
