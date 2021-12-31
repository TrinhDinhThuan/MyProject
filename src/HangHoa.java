import java.util.Date;
public class HangHoa{

    int loai;
    int maHang;
    String tenHangHoa;
    Double giaNhap;
    int soLuong;
    Date ngayNhapKho;

    public HangHoa(){};

    public HangHoa(int l, int id, String tHH, Double gN, int sL, Date nNK){
        loai = l;
        maHang = id;
        tenHangHoa = tHH;
        giaNhap = gN;
        soLuong = sL;
        ngayNhapKho = nNK;
    }

    void inThongTin(){
        System.out.println("Loai: " + loai);
        System.out.println("Ma: " + maHang);
        System.out.println("Ten hang: " + tenHangHoa);
        System.out.println("Gia nhap: " + giaNhap);
        System.out.println("So luong: " + soLuong);
        System.out.println("Ngay nhap kho: " + ngayNhapKho);
    }
}