package Bai_Tap.XayDungLopPhuongTrinhBac2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c;
            do {
                System.out.println("Nhập hệ số a: ");
                a = sc.nextDouble();
            }while ( a == 0 );

            System.out.println("Nhập hệ số b: ");
            b = sc. nextDouble();
            System.out.println("Nhập hệ số c: ");
            c = sc. nextDouble();

            QuadraticEquation ptb2 = new QuadraticEquation();
            if(ptb2.getDiscriminant() > 0){
                System.out.println("Phương trình có 2 nghiệm phân biệt là: "
                        + "\t r1 = "+ptb2.getRoot1()
                        + "\t r2 = "+ptb2.getRoot2());
            }else  {
                System.out.println("Phương trình vô nghiệm!!");
            }
    }
}
