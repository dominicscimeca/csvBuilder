package dscimeca.csv;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.nio.charset.Charset;

import java.io.File;

/**
 * Created by Admin on 10/29/14.
 */
public class App {
    public static void main(String [] args)
    {
        File csvData = new File("csv/src/thing.csv");
        Charset charset = Charset.defaultCharset();
        try {
            CSVParser parser = CSVParser.parse(csvData, charset, CSVFormat.EXCEL);
            for (CSVRecord csvRecord : parser) {
                System.out.println(csvRecord.toString());
            }
        } catch ( IOException e){
            System.out.println(e.getMessage());
        }



        System.out.println("working");
    }
}
