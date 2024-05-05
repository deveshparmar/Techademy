public class TimestampLogger extends LoggerDecorator{
    public TimestampLogger(Logger logger) {
        super(logger);
    }
    @Override
    public void log(String message) {
        String timestampedMessage = addTimestamp(message);
        logger.log(timestampedMessage);
    }

    private String addTimestamp(String message) {
        return System.currentTimeMillis() + ": " + message;
    }
}
