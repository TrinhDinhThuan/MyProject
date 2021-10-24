package com.thuantd2004110034.tuan06;

public class thamchieujavatestdrive {
    public static void main(String[] args) {
        thamchieujava so1, so2;

        so1 = new thamchieujava(5);

        so2 = new thamchieujava(10);

        System.out.println("số 1: " + so1.number);
        System.out.println("số 2: " + so2.number);
        

        swap(so1, so2);

        System.out.println("số 1: " + so1.number);
        System.out.println("số 2: " + so2.number);
        

    }


    static void swap(thamchieujava a, thamchieujava b){
        int temp;
        temp = a.number;
        a.number = b.number;

        b.number = temp;
        
    }
}
