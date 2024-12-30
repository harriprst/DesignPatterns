package Decorator;

public class Mn {
    public static void main(String[] args) {
        Pizza emptyPizza = new PlainPizza();

        MushroomTopping mushroomTopping = new MushroomTopping(emptyPizza);
        System.out.println(mushroomTopping.description());
        System.out.println(mushroomTopping.price());

        ChessePizza chessePizza = new ChessePizza(emptyPizza);
        System.out.println(chessePizza.description());
        System.out.println(chessePizza.price());



    }
}
