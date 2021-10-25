package vn.edu.tuan08;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        
    
    Queue<Integer> queue;

    queue = new LinkedList<>();
        queue.add(8);
        queue.add(10);
        queue.add(2);
        System.out.println(queue);

        int phanTuDuocLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra: " + phanTuDuocLayRa);

        System.out.println("Phần tử còn lại là: " + queue);

        int phanTuDuocTham = queue.peek();

        System.out.println("Phần tử được thăm là: " +phanTuDuocTham);

        System.out.println("Phần tử còn lại sau khi thăm là: " +queue);
         
    }
}