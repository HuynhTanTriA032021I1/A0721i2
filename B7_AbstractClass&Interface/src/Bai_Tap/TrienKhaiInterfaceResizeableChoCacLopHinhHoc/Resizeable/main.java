package Bai_Tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Resizeable;

import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Rectangle.Rectangle;
import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Shape.Shape;
import bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Square.Square;

public class main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]= new Shape(3.5);
        shapes[1]=new Rectangle(4,5);
        shapes[2]=new Square(4);

        double resizePercent = Math.random() * 100;
        System.out.println("Resize percent: " + resizePercent + "% \n----------");
        for (Shape shape: shapes) {
            if(shape instanceof Square){
                System.out.println("Diện tích hình vuông trước khi resize: "+((Square) shape).getArea());
                ((Square) shape).resize(resizePercent);
                System.out.println("Diện tích hình vuông sau khi resize: "+((Square) shape).getArea()+"\n----------");
            }else if(shape instanceof Rectangle){
                System.out.println("Diện tích hình chữ nhật trước khi resize: "+((Rectangle) shape).getArea());
                ((Rectangle) shape).resize(resizePercent);
                System.out.println("Diện tích hình chữ nhật sau khi resize: "+((Rectangle) shape).getArea()+"\n----------");
            }
        }}
}
