package oop.seminars.s06.solid.task04;

public class App {
    public static void main(String[] args) {
        int width = 12;
        int height = 6;
        int sideLength = 6;
        Shape square = new Square(sideLength);
        Shape rectangle = new Rectangle(width,height);
        System.out.printf("Square area: %d",square.area());
        System.out.printf("Rectangle area: %d", rectangle.area());
    }
}
