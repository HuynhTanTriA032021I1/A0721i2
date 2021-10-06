package Thuc_Hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);

        System.out.println("Nhập năm:");
        int nam = year.nextInt();

        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0){
                    System.out.printf("%d là năm nhuận", nam);
                } else {
                    System.out.printf("%d không phải là năm nhuận", nam);
                }
            } else {
                System.out.printf("%d is là năm nhuận", nam);
            }
        } else {
            System.out.printf("%d không phải là năm nhuận", nam);
        }


    }
}