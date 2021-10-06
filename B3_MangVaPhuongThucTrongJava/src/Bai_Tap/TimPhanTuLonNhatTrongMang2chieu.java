package Bai_Tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2chieu {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        x = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        y = scanner.nextInt();

        // khai báo ma trận A có x dòng, y cột
        int A[][] = new int[x][y];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int max = A[0][0];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
