package utils.csv;

import com.opencsv.*;

import java.io.*;
import java.util.List;

public class CSV {

    public List<String[]> ReadCSV(String filePath, char sep) throws IOException {
        FileReader filereader = new FileReader(filePath);
        CSVParser parser = new CSVParserBuilder().withSeparator(sep).build();

        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withCSVParser(parser)
                .build();

        List<String[]> allData = csvReader.readAll();
        return allData;
    }

    public void writeCSV(String filePath, char sep, List<String[]> data){
        File file = new File(filePath);

        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile, sep,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            // create a List which contains String array
            writer.writeAll(data);
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
