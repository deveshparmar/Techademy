import java.io.File;

public abstract class DataProcessor {
    public final void processData(File file) {
        readData(file);
        parseData();
        analyzeData();
        if (customerWantsReport()) {
            generateReport();
        }
    }

    // Abstract methods to be implemented by subclasses
    abstract void readData(File file);
    abstract void parseData();
    abstract void analyzeData();
    abstract void generateReport();

    // Hook method (optional) that can be overridden by subclasses
    boolean customerWantsReport() {
        return true;
    }
}
