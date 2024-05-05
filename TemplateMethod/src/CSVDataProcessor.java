import java.io.File;

// Concrete subclass - CSVDataProcessor
public class CSVDataProcessor extends DataProcessor{
    @Override
    void readData(File file) {
        System.out.println("Reading CSV data from file: " + file.getName());
    }

    @Override
    void parseData() {
        System.out.println("Parsing CSV data");
    }

    @Override
    void analyzeData() {
        System.out.println("Analyzing CSV data");
    }

    @Override
    void generateReport() {
        System.out.println("Generating CSV report");
    }
}
