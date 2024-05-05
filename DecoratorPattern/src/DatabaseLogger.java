public class DatabaseLogger extends LoggerDecorator{
    public DatabaseLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        // Code to log message to a database
        System.out.println("Logging to database: " + message);
        logger.log(message);
    }
}
