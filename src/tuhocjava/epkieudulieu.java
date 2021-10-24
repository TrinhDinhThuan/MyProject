package tuhocjava;

public class epkieudulieu {
    public static void main(String[] args) {
        //ép kiểu ngầm định
        int a = 10;
        int b = 5;

        System.out.println("a: " +a);
        System.out.println("b: " +b);

        float c = a;
        float d = b;

        System.out.println("c: " +c);
        System.out.println("d: " +d);
        //ép kiểu tường minh

        float e = 6.9f;
        float h = 7.8f;

        System.out.println("e: " +e);
        System.out.println("h: " +h);

        int g = (int)e;
        int m = (int)h;

        System.out.println("g: " +g);
        System.out.println("m: " +m);

        //ép kiểu nguyên thủy vs đối tượng

        int x = new Integer(32);

        System.out.println("x: " +x);

    }
}
