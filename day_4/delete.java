package day_4;

public class delete {
	public static void main(String[] args) {
        doublylinkedlist dll = new doublylinkedlist();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);

        System.out.print("Original list: ");
        printList(dll);

        dll.deleteAtPosition(3);  

        System.out.print("After deletion: ");
        printList(dll);
    }

    static void printList(doublylinkedlist dll) {
        doublylinkedlist.Node current = dll.getHead();
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


