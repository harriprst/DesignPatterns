package ChainOfResponsibility;

public class DebugLogger implements Logger {

    private Logger nextLogger = null;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String logger) {
        if(logger.equals("DEBUG")){
            System.out.println("debug logger");
        }else{
            nextLogger.log(logger);
        }
    }
}
