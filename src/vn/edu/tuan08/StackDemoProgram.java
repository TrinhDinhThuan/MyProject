package vn.edu.tuan08;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args) {
        Stack<String> stack;
        stack = new Stack<>();
        stack.push("Tôi tên");
        stack.push("là");
        stack.push("Trịnh Đình Thuận");
        System.out.println(stack);

        String poped = stack.pop();
        System.out.println("Đã lấy ra từ danh stack " + poped);
        System.out.println("Phần tử còn lại của stack");
        System.out.println(stack);

        String phanTuDuocTham = stack.peek();
        System.out.println("Thăm phần tử đầu: " + phanTuDuocTham);

        System.out.println("Sau khi thăm " + stack);

    }
}