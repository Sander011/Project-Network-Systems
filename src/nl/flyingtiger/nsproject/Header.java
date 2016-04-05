package nl.flyingtiger.nsproject;

import nl.flyingtiger.nsproject.Util.TypeOfPacket;

import java.io.UnsupportedEncodingException;

/**
 * Created by Jasper on 5-4-2016.
 */
public class Header {

    public static final int AMOUNT_OF_BYTES_IN_HEADER = 20;

    public static final int AMOUNT_OF_BYTES_PACKET_TYPE = 1;
    public static final int AMOUNT_OF_BYTES_SOURCE_ADDRESS = 4;
    public static final int AMOUNT_OF_BYTES_DESTINATION_ADDRESS = 4;
    public static final int AMOUNT_OF_BYTES_SEQUENCE_NUMBER = 4;
    public static final int AMOUNT_OF_BYTES_ACKNOWLEDGEMENT_NUMBER = 4;
    public static final int AMOUNT_OF_BYTES_CHECKSUM = 2;
    public static final int AMOUNT_OF_BYTES_ENCRYPTION = 1;



    private TypeOfPacket packetType;
    private String sourceAddress;
    private String destinationAddress;
    private int sequenceNumber;
    private int acknowledgementNumber;
    private int checkSum;
    private int encryption;



    public Header() {
    }

    /**
     * Instantiates a header of a packet
     * @param packetType
     * @param sourceAddress
     * @param destinationAddress
     * @param sequenceNumber
     * @param acknowledgementNumber
     * @param checkSum
     * @param encryption
     */
    public Header (TypeOfPacket packetType, String sourceAddress, String destinationAddress, int sequenceNumber,
                   int acknowledgementNumber, int checkSum, int encryption) {
        this.packetType = packetType;
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.sequenceNumber = sequenceNumber;
        this.acknowledgementNumber = acknowledgementNumber;
        this.checkSum = checkSum;
        this.encryption = encryption;
    }





    /**
     * NOT YET IMPLEMENTED
     * @param bytes
     */
    public Header(byte[] bytes){
        byte[] bytesTypePacket = new byte[AMOUNT_OF_BYTES_PACKET_TYPE];
        byte[] bytesSourceAddress = new byte[AMOUNT_OF_BYTES_SOURCE_ADDRESS];
        byte[] bytesDestinationAddress = new byte[AMOUNT_OF_BYTES_DESTINATION_ADDRESS];
        byte[] bytesSequenceNumber = new byte[AMOUNT_OF_BYTES_SEQUENCE_NUMBER];
        byte[] bytesAcknowledgementNumber = new byte[AMOUNT_OF_BYTES_ACKNOWLEDGEMENT_NUMBER];
        byte[] bytesChecksum = new byte[AMOUNT_OF_BYTES_CHECKSUM];
        byte[] bytesEncryption = new byte[AMOUNT_OF_BYTES_ENCRYPTION];

        System.arraycopy(bytes, 0, bytesTypePacket, 0, AMOUNT_OF_BYTES_PACKET_TYPE);
        System.arraycopy(bytes, 0, bytesSourceAddress, 1, AMOUNT_OF_BYTES_SOURCE_ADDRESS);
        System.arraycopy(bytes, 0, bytesDestinationAddress, 5, AMOUNT_OF_BYTES_DESTINATION_ADDRESS);
        System.arraycopy(bytes, 0, bytesSequenceNumber, 9, AMOUNT_OF_BYTES_SEQUENCE_NUMBER);
        System.arraycopy(bytes, 0, bytesAcknowledgementNumber, 13, AMOUNT_OF_BYTES_ACKNOWLEDGEMENT_NUMBER);
        System.arraycopy(bytes, 0, bytesChecksum, 17, AMOUNT_OF_BYTES_CHECKSUM);
        System.arraycopy(bytes, 0, bytesEncryption, 19, AMOUNT_OF_BYTES_ENCRYPTION);


        try{
            this.sourceAddress = new String(bytesSourceAddress, "UTF-8");
            this.destinationAddress = new String(bytesDestinationAddress, "UTF-8");
        } catch (UnsupportedEncodingException e){
            System.out.println("Cannot encode Source Address/Destination Address with UTF-8");
        }

    }

    public TypeOfPacket getPacketType() {
        return packetType;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public int getAcknowledgementNumber() {
        return acknowledgementNumber;
    }

    public int getCheckSum() {
        return checkSum;
    }

    public int getEncryption() {
        return encryption;
    }


    /**
     * NOT YET IMPLEMENTED!
     * @return
     */
    public byte[] toByteArray() {
        byte[] res = new byte[AMOUNT_OF_BYTES_IN_HEADER];



        return null;
    }


    public static void main(String[] args){
        byte[] test = new byte[3];

        test[0] = 1;
        test[1] = 1;
        test[2] = 1;

        System.out.println(test[0]);

        System.out.println(new Header().bytesToInt(test));

    }
}
