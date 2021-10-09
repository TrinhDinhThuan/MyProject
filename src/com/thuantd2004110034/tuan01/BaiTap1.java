package com.thuantd2004110034.tuan01;

    import java.util.Scanner;

    public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();
        System.out.print("Nhập điểm TB: ");
        float diemTB = sc.nextFloat();
        System.out.printf("<<%s>><<%.2f>>%.2f",ten,diemTB,diemTB);
    }
    
}
