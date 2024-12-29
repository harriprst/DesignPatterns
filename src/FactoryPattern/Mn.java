package FactoryPattern;

public class Mn {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape defaultShape = shapeFactory.getShape("TEST");
        defaultShape.draw();
    }

}
