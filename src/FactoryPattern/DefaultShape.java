package FactoryPattern;

public class DefaultShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw DefaultShape");
    }
}
