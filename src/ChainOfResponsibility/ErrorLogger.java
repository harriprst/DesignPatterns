package ChainOfResponsibility;

public class ErrorLogger implements Logger {

    private Logger nextLogger = null;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String logger) {
        if(logger.equals("ERROR")){
            System.out.println("error logger");
        }else{
            nextLogger.log(logger);
        }
    }
}
