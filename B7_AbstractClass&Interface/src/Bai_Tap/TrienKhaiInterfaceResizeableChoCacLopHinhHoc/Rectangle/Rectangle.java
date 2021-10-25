package Bai_Tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Rectangle;

import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Resizeable.Resizeable;
import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Shape.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        super(3.5);
    }

    public Rectangle(double width, double length) {
        super(3.5);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width *= 1 + percent / 100;
        this.length *= 1 + percent / 100;
    }
}
