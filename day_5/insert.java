package day_5;

public class insert {
		    public static void main(String[] args) {
	    	circularlinkedlist list = new circularlinkedlist();
	        list.insertAtTail(10);
	        list.insertAtTail(20);
	        list.insertAtTail(30);
	        list.insertAtTail(40);
	        display(list);
	    }
	    public static void display(circularlinkedlist list) {
	    	circularlinkedlist.Node head = list.getHead();
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        circularlinkedlist.Node temp = head;
	        System.out.print("Circular Linked List: ");
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }
	}

	


