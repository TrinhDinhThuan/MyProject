package tuhocjava;

import java.util.Scanner;

public class gandulieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("a = " +a);
        a+=3;
        System.out.println("a+=3: " +a);
        a-=3;
        System.out.println("a-=3: " +a);
        a*=3;
        System.out.println("a*=3: " +a);
        a/=3;
        System.out.println("a/=3: " +a);
        a%=3;
        System.out.println("a%=3: " +a);
    }
}
