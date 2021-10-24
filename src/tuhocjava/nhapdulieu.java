package tuhocjava;

import java.util.Scanner;

public class nhapdulieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap Ho Va Ten: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhap MSSV: ");
        int maSoSV = sc.nextInt();

        System.out.println("Nhap diem: ");
        float diemSo = sc.nextFloat();

        System.out.println("----------");
        System.out.println("Ho va Ten: " +hoVaTen);
        System.out.println("Ma so sinh vien: " +maSoSV);
        System.out.println("Diem so: " +diemSo);
    }
}
