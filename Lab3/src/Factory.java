
// Logger interface
interface Logger {
    void log(String msg);
}

// File logger
class FileLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("Logging to file: " + msg);
    }
}


class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("Logging to console: " + msg);
    }
}

abstract class LoggerFactory {
    public abstract Logger createLogger();

    
    public void logmsg(String msg) {
        Logger logger = createLogger();
        logger.log(msg);
    }
}


class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}