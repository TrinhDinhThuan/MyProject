package vn.edu.tuan02;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien;//khai báo biến tên sinhVien tham chiếu đối tượng kiểu SinhVien
        
        sinhVien = new SinhVien();//Tạo đối tượng sinh viên trong vùng nhớ Heap
        sinhVien.mssv = "2004110034";
        sinhVien.tenSinhVien = "Trịnh Đình Thuận";
        sinhVien.queQuan = "Khánh Hòa";
        sinhVien.tuoi = 18;  
        
        sinhVien.inThongTinSV();
    }
    
}
