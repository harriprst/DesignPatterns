package Decorator;

public class PizzaToppingDecorator implements Pizza {

    public Pizza pizza;

    PizzaToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public double price() {
        return 10;
    }
}
