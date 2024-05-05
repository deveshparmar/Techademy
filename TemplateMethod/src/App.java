import java.io.File;

public class App {
    public static void main(String[] args) {
        // Process different types of data files
        File xmlFile = new File("data.xml");
        DataProcessor xmlDataProcessor = new XMLDataProcessor();
        xmlDataProcessor.processData(xmlFile);

        File csvFile = new File("data.csv");
        DataProcessor csvDataProcessor = new CSVDataProcessor();
        csvDataProcessor.processData(csvFile);

        File jsonFile = new File("data.json");
        DataProcessor jsonDataProcessor = new JSONDataProcessor();
        jsonDataProcessor.processData(jsonFile);
    }
}
