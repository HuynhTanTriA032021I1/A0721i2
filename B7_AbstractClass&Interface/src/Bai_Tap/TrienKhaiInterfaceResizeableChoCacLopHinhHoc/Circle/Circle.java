package Bai_Tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Circle;

import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Resizeable.Resizeable;
import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Shape.Shape;

public class Circle extends Shape implements Resizeable {

    private double radius = 1.0;

    public Circle() {
        super(3.5);
    }

    public Circle(double radius) {
        super(3.5);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= 1 + percent / 100;
    }
}