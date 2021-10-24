package com.thuantd2004110034.tuan04;

public class DOG {
        public int size;
        public String name;
        public String color;
    
        public DOG (){}
    
        public DOG(int s) {
            size = s;
        }
    
        public DOG(int s, String c, String n) {
            size = s;
            name = n;
            color = c;
        }
    
        void inThongTin() {
            System.out.println("Size " + size + " " + ", color = " + color + " " + ", name = " +" "+ name);
        }
    }
