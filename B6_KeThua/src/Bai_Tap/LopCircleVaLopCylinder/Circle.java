package Bai_Tap.LopCircleVaLopCylinder;

public class Circle {

    private double Bankinh ;
    private String Mausac;

    public Circle(){

    }

    public Circle(double Bankinh, String Mausac) {
        this.Bankinh = Bankinh;
        this.Mausac = Mausac;
    }

    public double getBankinh() {
        return Bankinh;
    }

    public void setBankinh(double Bankinh) {
        this.Bankinh = Bankinh;
    }

    public String getMausac() {
        return Mausac;
    }

    public void setMausac(String Mausac) {
        this.Mausac = Mausac;
    }

    public double Dientich(){
        return Math.PI * Bankinh * Bankinh;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Bankinh=" + Bankinh +
                ", Mausac='" + Mausac + '\'' +
                '}';
    }
}
