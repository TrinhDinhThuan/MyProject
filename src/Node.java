public class Node {
    HangHoa data;

    Node next;

    Node prev;

    Node() {

    }

    Node(HangHoa d) {
        data = d;
    }
    Node(HangHoa d, Node n, Node p){
        data = d;
        next = n;
        prev = p;
    }
}
