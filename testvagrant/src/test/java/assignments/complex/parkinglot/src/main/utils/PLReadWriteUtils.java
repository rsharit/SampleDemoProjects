package assignments.complex.parkinglot.src.main.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PLReadWriteUtils {

    private String parkingLotCustomersFile = "src/test/java/assignments/complex/parkinglot/src/" +
            "main/resources/ParkingLotCustomers.txt";

    public boolean checkCustomerID(String customerId){
        boolean exists = false;
        try{
            List<String> availableIds = readCustomerIdFromFile(parkingLotCustomersFile);
            if (availableIds.contains(customerId))
                exists = true;
            else
                exists = false;

            //writeCustomerIdToAFile(parkingLotCustomersFile, customerId);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return exists;
    }

    public String readFile(String filePath){
        String data = "";
        try{

            File file = new File(filePath);
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            String tempData;
            while ((tempData = br.readLine()) != null)
                data = data + tempData;
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public List<String> readCustomerIdFromFile(String filePath) throws IOException {
        String st;
        File file = new File(filePath);
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        List<String> dataList = new ArrayList<>();

        while ((st = br.readLine()) != null)
            dataList.add(st);
        return dataList;
    }

    private void writeCustomerIdToAFile(String fileName, String uniqueId) throws IOException {
        /**
         * note : appending text
         */
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(uniqueId + "\n");
        writer.close();
    };

    /**
     * note : always clearing and writing
     * @param fileName
     * @param json
     * @throws IOException
     */
    public void writeJsonToAFile(String fileName, String json) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(json);
        writer.close();
    };
}
