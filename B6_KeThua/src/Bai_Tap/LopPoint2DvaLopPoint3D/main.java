package Bai_Tap.LopPoint2DvaLopPoint3D;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(21, 11);
        System.out.println(point2D);

        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 1999);
        System.out.println(point3D);
    }
}
