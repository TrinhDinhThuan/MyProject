package com.thuantd2004110034.tuan05;

    import java.util.ArrayList;
import java.util.List;


public class CTMinhHoaArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Cường");
        a.add("True");
        a.add(1);
        a.add(2.5);
        Integer x = (Integer) a.get(2);
        {
        }
        a.add(new DOG(22, "Vàng", "Fido"));
        System.out.println(a);
        // lấy 1 phần tử từ list
        DOG dog = (DOG) a.get(4);
        System.out.println("Dog name: " + dog.name + "\n" + "Color: " + dog.color + "\n" + "Size: " + dog.size);
        List bienTCArrayList = new ArrayList();
        bienTCArrayList.add(new BaiTap4("Trịnh Đình Thuận", 7, "Khá"));

        List<String> lisStrings = new ArrayList<>();
        // lisStrings.add(1);//Báo lỗi
        lisStrings.add("Tèo");

        ArrayList<BaiTap4> aStudent = new ArrayList<>();
        // aStudent.add("Mr tèo");//Lỗi

        /*
         * Bai4 student2 = new Bai4(); aStudent.add(student2);
         */

        aStudent.add(new BaiTap4());

        ArrayList<String> ten = new ArrayList<>();
        ten.add("Cường");
        ten.add("Khải");
        ten.add("Linh");
        ten.add("Như");
        String s = ten.get(2);
        System.out.println("Tên:" + s);
        bienTCArrayList.contains("Trịnh Đình Thuận");
        System.out.println(bienTCArrayList.contains("Trịnh Đình Thuận"));

    }
}
