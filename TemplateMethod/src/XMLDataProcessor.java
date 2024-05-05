import java.io.File;

// Concrete subclass - XMLDataProcessor
public class XMLDataProcessor extends DataProcessor{
    @Override
    void readData(File file) {
        System.out.println("Reading XML data from file: " + file.getName());
    }

    @Override
    void parseData() {
        System.out.println("Parsing XML data");
    }

    @Override
    void analyzeData() {
        System.out.println("Analyzing XML data");
    }

    @Override
    void generateReport() {
        System.out.println("Generating XML report");
    }
}
