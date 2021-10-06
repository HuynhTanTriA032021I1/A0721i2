package Thuc_Hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner bn = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double a = bn.nextInt();
        System.out.println("Nhập b: ");
        double b = bn.nextInt();

        if (a != 0) {
            double x = -b/ a;
            System.out.printf("X = %f", x);
        } else {
            if (b == 0) {
                System.out.print("Phương trình vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        }
    }
}