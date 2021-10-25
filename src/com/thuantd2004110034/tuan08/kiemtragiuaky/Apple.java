package com.thuantd2004110034.tuan08.kiemtragiuaky;

     import java.util.Scanner;

public class Apple {

     String id;
     String weight;
     String color;

    static Scanner sc = new Scanner(System.in);

    Apple() {
    }

     void inThongTinApple() {
        System.out.println("===================");
        System.out.println("Mã id: " + id);
        System.err.println("Khối Lượng: " + weight);
        System.out.println("Màu sắc: " + color);
    }

     void nhapThongTinApple() {
        System.out.println("Mã id: ");
        id = sc.nextLine();
        System.err.println("Khối Lượng: ");
        weight = sc.nextLine();
        System.out.println("Màu sắc: ");
        color = sc.nextLine();
    }

}


