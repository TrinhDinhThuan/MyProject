package vn.edu.tuan03;

public class Cow {
    double weight;
    String breed;
    String color;

    //Hàm tạo 
    //developer tạo ra KHÔNG ĐỂ java compiler tạo ra

    Cow(){//Hàm tạo mặc định do developer

    }
    Cow(double w){
        weight = w; 
    }
    Cow(double w, String br, String cl){
        weight = w;
        breed = br;
        color = cl;
    }
}
