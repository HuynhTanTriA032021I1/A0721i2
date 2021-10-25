package Bai_Tap.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double ChieuCao;

    public Cylinder(){

    }

    public Cylinder(double chieuCao) {
        this.ChieuCao = chieuCao;
    }

    public Cylinder(double Bankinh, String Mausac, double chieuCao) {
        super(Bankinh, Mausac);
        this.ChieuCao = chieuCao;
    }

    public double getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(double chieuCao) {
        ChieuCao = chieuCao;
    }

    public double Thetich(){
        return ChieuCao * Math.PI * getBankinh() * getBankinh();
    }

    @Override
    public String toString() {
        return "A Circle with Chieucao ="
                + getChieuCao()
                + '}' +
                ", which is a subclass of " +
                super.toString();
    }
}
