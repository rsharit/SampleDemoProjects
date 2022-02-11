package assignments.complex.parkinglot.src.main.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface PLReadWriteUtilsI {
    /**
     *
     * @param customerId
     * @return
     */
    public boolean checkCustomerID(String customerId);

    /**
     *
     * @param filePath
     * @return
     */
    public String readFile(String filePath);

    /**
     *
     * @param filePath
     * @return
     * @throws IOException
     */
    public List<String> readCustomerIdFromFile(String filePath) throws IOException ;

    /**
     * note : always clearing and writing
     * @param fileName
     * @param json
     * @throws IOException
     */
    public void writeJsonToAFile(String fileName, String json) throws IOException;


}
