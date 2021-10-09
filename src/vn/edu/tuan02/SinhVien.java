package vn.edu.tuan02;

import java.util.Date;

public class SinhVien {
    //thuộc tính
    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan; 

    Date ngaySinh;
    //phương thức
    //<kiểu trả về> <tên hàm> <(danh sách tham số)> {......}
    void inThongTinSV(){
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên Sinh Viên: " + tenSinhVien);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Ngày sinh: " + ngaySinh);
    }
}
    
