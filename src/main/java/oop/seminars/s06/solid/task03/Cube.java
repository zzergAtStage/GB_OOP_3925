package oop.seminars.s06.solid.task03;

public class Cube implements Shape3D, Shape2D {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * The cube has area, so we're using a Shape2D interface
     * @return area of a cube
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
