package ChainOfResponsibility;

public class InfoLogger implements Logger {

    private Logger nextLogger = null;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String logger) {
        if(logger.equals("INFO")){
            System.out.println("info logger");
        }else{
            nextLogger.log(logger);
        }
    }
}
