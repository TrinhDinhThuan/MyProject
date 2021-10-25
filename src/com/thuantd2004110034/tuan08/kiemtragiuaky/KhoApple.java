package com.thuantd2004110034.tuan08.kiemtragiuaky;


import java.util.ArrayList;


public class KhoApple {
    private ArrayList<Apple> danhSach;
		
		public KhoApple() {
			this.danhSach = new ArrayList<Apple>();
		}
		
		public KhoApple(ArrayList<Apple> danhSach) {
			this.danhSach = danhSach;
		}
        // 1.	Thêm táo vào danh sách.
		public void themtao(Apple sp) {
			this.danhSach.add(sp);
		
		}
		//2. In danh sách táo ra màn hình.
		public void indanhsachtao() {
			for (Apple Apple : danhSach) {
				System.out.println(Apple);
			}
        }
       // 3.	Tìm kiếm tất cả táo dựa trên màu sắc  được nhập từ bàn phím.
		public void timtao(String tensp) {
			for (Apple sc : danhSach);
         }
        }
				
