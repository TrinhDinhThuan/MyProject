import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class kho {
    Node head = null;
    Node tail = null;
    int sL;

    kho() {

    }

    kho(int soLuong) {
        sL = soLuong;
    }

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    void addHead(HangHoa data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    void addTail(HangHoa data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            tail = newNode;

        } else {

            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;

        }

    }

    void kho() throws ParseException {
        addTail(new HangHoa(1, "Ga Ran", "Thuc pham", 30000, 25, chuyenNgay("15/05/2021")));
        addTail(new HangHoa(2, "Binh hoa", "Sanh su", 62000, 10, chuyenNgay("9/2/2020")));
        addTail(new HangHoa(3, "Tu lanh", "Dien may", 198000, 5, chuyenNgay("03/05/2020")));
        addTail(new HangHoa(4, "Laptop", "Dien may", 9000000, 7, chuyenNgay("10/07/2020")));
        addTail(new HangHoa(5, "Coca", "Thuc pham", 17000, 20, chuyenNgay("20/11/2021")));
        addTail(new HangHoa(6, "Noi com dien", "Dien may", 900000, 12, chuyenNgay("29/03/2020")));
        addTail(new HangHoa(7, "Ly nuoc", "Sanh su", 13000, 35, chuyenNgay("22/1/2020")));
        addTail(new HangHoa(8, "Nuoc tuong", "Thuc pham", 30000, 26, chuyenNgay("23/11/2021")));
        addTail(new HangHoa(9, "Tivi", "Dien may", 8000000, 4, chuyenNgay("20/01/2020")));
        addTail(new HangHoa(10, "May dieu hoa", "Dien may", 5000000, 7, chuyenNgay("2/12/2020")));
        addTail(new HangHoa(11, "Ca vien chien", "Thuc pham", 2000, 15, chuyenNgay("13/07/2021")));
        addTail(new HangHoa(12, "Mi tom", "Thuc pham", 3500, 100, chuyenNgay("5/11/2020")));
        addTail(new HangHoa(13, "Den ngu", "Dien may", 169000, 19, chuyenNgay("20/12/2020")));
        addTail(new HangHoa(14, "Am tra", "Sanh su", 343000, 2, chuyenNgay("12/04/2020")));
        addTail(new HangHoa(15, "May giat", "Dien may", 6000000, 8, chuyenNgay("12/06/2020")));
        addTail(new HangHoa(16, "Dia su", "Sanh su", 16000, 42, chuyenNgay("13/04/2020")));
        addTail(new HangHoa(17, "Tra sua", "Thuc pham", 20000, 26, chuyenNgay("05/12/2020")));
        addTail(new HangHoa(18, "Dien thoai", "Dien may", 11000000, 1, chuyenNgay("23/07/2020")));
        addTail(new HangHoa(19, "Keo Ngam", "Thuc pham", 8000, 28, chuyenNgay("05/12/2020")));
        addTail(new HangHoa(20, "Den pin", "Dien may", 100000, 6, chuyenNgay("23/01/2020")));

    }

    HangHoa nhapDSHH() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin hang hoa muon them. ");
        System.out.print("Loai: ");
        String loai = sc.nextLine();
        System.out.print("Ma:");
        int maHang = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten hang: ");
        String tenHangHoa = sc.nextLine();
        System.out.print("Gia nhap: ");
        Double giaNhap = sc.nextDouble();
        sc.nextLine();
        System.out.print("So luong: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        Date ngayNhapKho;
        System.out.print("Nhap ngay nhap kho(dd/mm/yyyy): ");
        Date newdate = chuyenNgay(sc.nextLine());
    }

    void coppyData(HangHoa a, HangHoa b) {

        a.maHang = b.maHang;
        a.tenHangHoa = b.tenHangHoa;
        a.loai = b.loai;
        a.giaNhap = b.giaNhap;
        a.soLuong = b.soLuong;
        a.ngayNhapKho = b.ngayNhapKho;

    }

    void swapData(HangHoa a, HangHoa b) throws ParseException {

        Node temp = new Node(new HangHoa(0, "0", "0", 0, 0, chuyenNgay("01/01/2001")));
        coppyData(temp.data, a);
        coppyData(a, b);
        coppyData(b, temp.data);

    }

    void removeHangHoa(int id) {

        Node current = head;
        if (head.next == null) {
            head = null;
            return;
        }
        if (head.data.maHang == id) {
            head.next.prev = null;
            head = head.next;
            return;
        }
        if (tail.data.maHang == id) {
            tail.prev.next = null;
            tail = tail.prev;
            return;
        }
        while (current != null) {
            if (current.data.maHang == id) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                break;
            }
            current = current.next;

        }

    }

    void fixed(int fixedten) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Node current = head;
        if (current == null) {
            System.out.println("Danh sach rong");
        } else
            while (current != null) {
                if (current.data.maHang == fixedten) {
                    System.out.print("Loai: ");
                    String loai = scanner.nextLine();
                    System.out.print("Ten hang hoa: ");
                    String tenHangHoa = scanner.nextLine();
                    current.data.tenHangHoa = tenHangHoa;
                    System.out.print("Gia nhap: ");
                    Double giaNhap = scanner.nextDouble();
                    scanner.nextLine();
                    current.data.giaNhap = giaNhap;
                    System.out.print("So luong: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();
                    current.data.soLuong = soLuong;
                    Date ngayNhapKho;
                    System.out.println("Ngay nhap kho: ");
                    String strngayNhapKho = scanner.nextLine();
                    ngayNhapKho = chuyenNgay(strngayNhapKho);
                    current.data.ngayNhapKho = ngayNhapKho;
                    System.out.println("Da sua thanh cong hang hoa co ma " + fixedten);
                    return;
                }
                current = current.next;
            }
    }

    void printList() {

        Node current = head;
        System.out.println("Danh sach hang hoa:");
        while(current != null){
            current.data.inThongTin();
            current = current.next;
        }
        }
    void findloai(String loai) {

        Node current = head;
            
        while (current != null) {
            if (current.data.loai.equalsIgnoreCase(loai)) {
            current.data.inThongTin();
            current = current.next;
            }
        }
    
        }
    void findgia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá tối thiểu: ");
        Double timGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập giá tối đa: ");
        double timGia2 = sc.nextDouble();
        sc.nextLine();
    
               
    }
    void findngay(String ngayDau, String ngaySau)throws ParseException{
        Date ngay1;
        ngay1 = chuyenNgay(ngayDau);
        Date ngay2;
        ngay2 = chuyenNgay(ngaySau);
        Node current = head;
}
}
