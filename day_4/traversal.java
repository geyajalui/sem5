package day_4;

public class traversal {
	public static void main(String[] args) {
        doublylinkedlist dll = new  doublylinkedlist ();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.append(50);
        doublylinkedlist .Node head = dll.getHead();
        System.out.println("Forward traversal:");
        doublylinkedlist .Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while (head != null && head.next != null) {
            head = head.next;
        }
        System.out.println("\nBackward traversal:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.prev;
        }
    }
}


