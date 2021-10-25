package Bai_Tap;

public class Circle {
    private String color = "red";
    private double radius = 1;

    public Circle (){

    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double Circle(double radius){
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
