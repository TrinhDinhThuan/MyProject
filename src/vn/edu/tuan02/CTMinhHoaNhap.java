package vn.edu.tuan02;

import java.util.Scanner;//#include<stdio.h>

public class CTMinhHoaNhap {
    public static void main(String[] args) {
        Scanner bienNhap;//Biến tham chiếu đối tượng kiểu Scanner   
        double diemMonCTDLGT;
        //Tạo đối tượng
        //toán tử new
        //Hàm tạo của Lớp Scanner 

        bienNhap = new Scanner(System.in);
        System.out.print("Nhập vào điểm môn CTDL & GT: ");
        diemMonCTDLGT = bienNhap.nextDouble();  

        System.out.println("Điểm vừa nhập vào là: " + diemMonCTDLGT);

        String chuoi = new String("Hello Mí bạn");

        //String chuoi;

        //double diemMonCTDLGT;
    }
}
