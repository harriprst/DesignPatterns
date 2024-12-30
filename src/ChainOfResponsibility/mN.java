package ChainOfResponsibility;

public class mN {

    public static void main(String[] args) {

        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();
        Logger errorLogger = new ErrorLogger();

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);


        debugLogger.log("DEBUG");
        debugLogger.log("INFO");

    }
}
