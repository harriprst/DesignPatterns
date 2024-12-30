package ChainOfResponsibility;

public interface Logger {

    void setNextLogger(Logger nextLogger);
    void log(String logger);
}
