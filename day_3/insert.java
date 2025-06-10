package day_3;
class Node {
  int data;
    Node next;

    Node(int data) { this.data = data; }

}



public class insert {

    public static Node insert(Node head, int data, int pos) {

        Node newNode = new Node(data);

        if (pos == 0) {

            newNode.next = head;

            return newNode;

        }

        Node current = head;

        for (int i = 0; i < pos - 1 && current != null; i++)

            current = current.next;

        if (current == null) return head; 

        newNode.next = current.next;

        current.next = newNode;

        return head;

    }



    public static void printList(Node head) {

        for (Node curr = head; curr != null; curr = curr.next)

            System.out.print(curr.data + " ");

        System.out.println();

    }



    public static void main(String[] args) {

        Node head = null;

        head = insert(head, 10, 0); 

        head = insert(head, 20, 1); 

        head = insert(head, 15, 1);

        head = insert(head, 5, 0);  

        printList(head);          

    }

}

