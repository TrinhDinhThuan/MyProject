package com.thuantd2004110034.tuan03;

    import java.util.Scanner;

    public class BaiTap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bảng cửu chương:");
        for(int i = 1;i<10;i++){
            for(int j = 1;j<=10;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
    
}
