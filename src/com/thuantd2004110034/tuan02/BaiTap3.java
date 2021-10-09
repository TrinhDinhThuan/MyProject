package com.thuantd2004110034.tuan02;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tienDien;
        System.out.print("Nhập số điện đã sử dụng: ");
        float soDien = sc.nextFloat();
        if (soDien <= 50) {
            tienDien = (int)(soDien * 1000);
        } else {
            tienDien = (int)(50 * 1000 + soDien - 50 * 1200);
        }
        System.out.println("TIền điện phải trả là: " + tienDien + "Đồng");
    }
}
