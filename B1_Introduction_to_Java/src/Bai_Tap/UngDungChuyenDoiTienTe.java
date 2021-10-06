package Bai_Tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner rate = new Scanner(System.in);
        System.out.println("VNĐ= ");
        double vnd = rate.nextDouble();

        double usd = vnd / 23000;
        System.out.printf("VNĐ= "+vnd+ "chuyển đổi USD= "+usd);
    }
}
