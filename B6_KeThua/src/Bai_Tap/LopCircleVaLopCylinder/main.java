package Bai_Tap.LopCircleVaLopCylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(3,"red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3.5,"blue",5);
        System.out.println(cylinder);
    }
}
