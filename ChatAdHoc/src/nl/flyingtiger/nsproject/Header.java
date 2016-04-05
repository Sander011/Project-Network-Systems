package nl.flyingtiger.nsproject;

import nl.flyingtiger.nsproject.Util.TypeOfPacket;

/**
 * Created by Jasper on 5-4-2016.
 */
public class Header {

    public static final int AMOUNT_OF_BYTES_IN_HEADER = 14;

    public static final int AMOUNT_OF_BYTES_PACKET_TYPE = 1;
    public static final int AMOUNT_OF_BYTES_SOURCE_ADDRESS = 1;
    public static final int AMOUNT_OF_BYTES_DESTINATION_ADDRESS = 1;
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
}
