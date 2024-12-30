package Decorator;

public class MushroomTopping extends PizzaToppingDecorator{
    MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description() + ", mushroom";
    }

    @Override
    public double price() {
        return pizza.price() + 10;
    }

}
