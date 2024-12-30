package Decorator;

public class PlainPizza implements Pizza {
    @Override
    public String description() {
        return "Plain Pizza";
    }

    @Override
    public double price() {
        return 10;
    }
}
