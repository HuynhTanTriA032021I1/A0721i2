package Bai_Tap;

import java.util.Scanner;

public class TimPhanTuNhoNhatTronggMang {
    public static void main(String[] args) {
        int n,min;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phẩn tử của mảng");
            n =sc.nextInt();
        }while (n < 1 || n > 20);

        int [] arr = new int[n] ;
        int i = 0;
        while (i < arr.length) {
            System.out.print("Phần tử số: " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Mảng : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

         min = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min + " \t Tại vị trí: " + index);
    }
}
