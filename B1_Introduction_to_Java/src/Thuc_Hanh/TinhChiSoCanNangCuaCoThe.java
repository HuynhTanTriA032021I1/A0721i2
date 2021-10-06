package Thuc_Hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Cân Nặng ( kilogram ):");
        double weight = scanner.nextDouble();

        System.out.print("Nhập Chiều Cao ( meter ):");
        double height = scanner.nextDouble();

        double  bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Tình Trạng Cơ Thể\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu Cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình Thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa Cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");

    }
}

