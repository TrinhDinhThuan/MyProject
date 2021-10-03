package vn.edu.tuan02;

import java.util.Scanner;

public class ChuongTrinhLab2Bai4 { 
    public static void main(String[] args) {
        System.out.println("=========Menu=========");
        System.out.println(">>1. Giải phương trình bậc I");
        System.out.println(">>2. Giải phương trình bậc II");
        System.out.println(">>3. Tính tiền điện");
        System.out.println("=========Menu=========");
        int suLuaChon;
        System.out.println("Lựa chọn chức năng: ");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: ;break;
            case 2: ;break;
            case 3: ;break;
            default: System.out.println("Chọn chức năng khác");
        }
    
    }
    static void giaiPTBacI(){
        System.out.println("Triển khai code giải phương trình bậc I ... ");
    }
    static void giaiPTBacII(){
        System.out.println("Triển khai code giải phương trình bậc II ... ");
    }
    static void tinhTienDien(){
        System.out.println("Triển khai code tính tiền điện ... ");
    }
    
}
