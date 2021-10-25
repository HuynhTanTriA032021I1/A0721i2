package Bai_Tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.Colorable;

import bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.Circle.Circle;
import bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.Rectangle.Rectangle;
import bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.Shape.Shape;
import bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.Square.Square;


public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(21, 11);
        shapes[2] = new Square(9);

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
