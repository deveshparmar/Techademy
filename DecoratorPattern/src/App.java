public class App {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        fileLogger.log("Error occurred: Null pointer exception");

        Logger timeStampFileLogger = new TimestampLogger(new FileLogger());
        timeStampFileLogger.log("Error occurred: Out of memory");

        Logger databaseLogger = new DatabaseLogger(new TimestampLogger(new FileLogger()));
        databaseLogger.log("Error occurred: Database connection failed");
    }
}
