package Bai_Tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Shape;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape(3.5);
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
