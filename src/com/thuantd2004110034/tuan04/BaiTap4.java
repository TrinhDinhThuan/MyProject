package com.thuantd2004110034.tuan04;

public class BaiTap4 {

    String hoTen;
    float diem;
    String hocLuc;

    public BaiTap4() {

    }

    public BaiTap4(String hT, float d, String hL) {
        hoTen = hT;
        diem = d;
        hocLuc = hL;
    }
    void inThongTin() {
        System.out.println("Họ tên:" + hoTen);
        System.out.println("Điểm:" + diem);
        System.out.println("Học Lực:" + hocLuc);
    }


}
