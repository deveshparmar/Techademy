import java.io.File;

// Concrete subclass - JSONDataProcessor
public class JSONDataProcessor extends DataProcessor{
    @Override
    void readData(File file) {
        System.out.println("Reading JSON data from file: " + file.getName());
    }

    @Override
    void parseData() {
        System.out.println("Parsing JSON data");
    }

    @Override
    void analyzeData() {
        System.out.println("Analyzing JSON data");
    }

    @Override
    void generateReport() {
        System.out.println("Generating JSON report");
    }
}
