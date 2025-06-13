package day_5;

public class display_cll {

	    public static void main(String[] args) {
	    	circularlinkedlist list = new circularlinkedlist();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);
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



