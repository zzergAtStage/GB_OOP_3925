package oop.seminars.s06.solid.task04;

public abstract class Shape {
    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return this.height * this.width;
    }
}
