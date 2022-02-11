package assignments.complex.parkinglot.src.main.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PLReadWriteUtils implements PLReadWriteUtilsI{

    private final String parkingLotCustomersFile = "src/test/java/assignments/complex/parkinglot/src/" +
            "resources/ParkingLotCustomers.txt";

    public boolean checkCustomerID(String customerId){
        boolean exists = false;
        try{
            List<String> availableIds = readCustomerIdFromFile(parkingLotCustomersFile);
            exists = availableIds.contains(customerId);

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
    }

    /**
     * note : always clearing and writing
     * @param fileName
     * @param json
     * @throws IOException
     */
    public void writeJsonToAFile(String fileName, String json) throws IOException {
        if (!checkIfFileExists(fileName)){
            createFile(fileName);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(json);
        writer.close();
    }

    private boolean checkIfFileExists(String filePath){
        File file = new File(filePath);
        return file.exists();
    }

    private boolean createFile(String fileName){
        boolean result = false;
        try {
            //fileName = "/Users/rajendersinghharit/Desktop/testVagrant/assignments/SampleDemoProjects/testvagrant/src/test/java/assignments/complex/parkinglot/src/resources/CustomersJson/DL14CA0624.json";
            File file = new File(fileName);
            result = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  result;
    }
}
