package com.thuantd2004110034.tuan08.kiemtragiuaky;
import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner kiemtratao = new Scanner(System.in);
		
		Apple dst = new Apple();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
			  "1.	Thêm táo vào danh sách.\n"
			+ "2.	In táo.\n"
			+ "3.	Tìm kiếm táo dựa trên màu được nhập từ bàn phím.\n"
            + "0.     thoát\n");
			
            luaChon = kiemtratao.nextInt();
			kiemtratao.nextLine();
            
            if(luaChon==1) {
                //				1.	Thêm sản phẩm vào danh sách.
                void nhapThongTinApple() {
                    System.out.println("Mã id: ");
                    id = sc.nextLine();
                    System.err.println("Khối Lượng: ");
                    weight = sc.nextLine();
                    System.out.println("Màu sắc: ");
                    color = sc.nextLine();
                }
                               
                                Apple sp = new Apple(id,weight,color);
                                dst.themtao(sp);
            }else if(luaChon==2) {
                //				2.	In danh sách sinh viên ra màn hình.
                                dst.indanhsachtao();
                                kiemtratao.nextLine();
                                
            }else if(luaChon==3) {
                //				8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
                                System.out.println("Nhập màu sắc: "); String mausac = kiemtratao.nextLine();
                                System.out.println("Kết quả tìm kiếm: "+ mausac);
                                dst.timtao(mausac);
                                kiemtratao.nextLine();
                                
                            }
                        }while(luaChon!=0);
                        
                             

                        }
    
}