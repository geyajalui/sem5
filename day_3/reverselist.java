package day_3;
class node3{

    int data;

    Node next;
    node3(int data) {
        this.data = data;
    }
}
public class reverselist{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
