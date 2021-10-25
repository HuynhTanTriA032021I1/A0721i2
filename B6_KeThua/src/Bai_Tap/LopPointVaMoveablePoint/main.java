package Bai_Tap.LopPointVaMoveablePoint;

public class main {
    public static void main(String[] args) {
        Point point = new Point(21, 11);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(), 01, 04);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println("Move: "+moveablePoint);
    }
}
