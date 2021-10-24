package com.thuantd2004110034.tuan04;

    import java.lang.reflect.Array;
import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        // cú pháp khai báo mảng
        int[] mangSoNguyen;// chưa chỉ định số phần tử

        mangSoNguyen = new int[5];

        double mangSoThuc[] = new double[10];

        // trước khi dùng phải xác định số phần tử của mảng
        mangSoNguyen[0] = 2;

        // khai báo có khởi tạo giá trị cho mảng
        double diemMonHoc[] = new double[] { 10.5, 5.5, 3.0, 4.5 };
        System.out.println("Mảng điểm môn học" + Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];
        // 5.5,5.5,3.0,4.5
        System.out.println("Mảng điểm môn học" + Arrays.toString(diemMonHoc));
        System.out.println("Số phần tử:" + diemMonHoc.length);

        // cách 2
        String dsTenSinhVien[] = { "tèo", "tí", "dần" };

        // dùng vòng lặp for-each để duyệt mảng
        for (double diem : diemMonHoc) {
            System.out.println(diem);
        }

        // Khai báo mảng kiểu tham chiếu đối tượng
        DOG[] danhSachDog = new DOG[7];
        DOG dog0 = new DOG(10, "Đen ", "FIdo");
        DOG dog1 = new DOG(7, "Vàng ", "Na Na");
        DOG dog2 = new DOG(25, "Vàng đen ", "Lu Lu");

        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[1] = new DOG(6,"nanh bạc","ak ak");
        danhSachDog[2].inThongTin();
        danhSachDog[1].color = "đen";
        danhSachDog[1].inThongTin();
        System.out.println(danhSachDog[1].color.length());
        danhSachDog[1].color.length();
    

    }
}
