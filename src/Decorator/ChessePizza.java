package Decorator;

public class ChessePizza extends PizzaToppingDecorator{
    ChessePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description() + ", cheese";
    }

    @Override
    public double price() {
        return pizza.price() + 20;
    }
}
