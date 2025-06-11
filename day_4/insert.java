package day_4;

public class insert 
{
	public static void main(String[] args)
	{
		doublylinkedlist dll = new doublylinkedlist();
		dll.append(10);
		dll.append(20);
		dll.append(40);
		dll.append(50);
	        System.out.print("Original list: ");
	        printList(dll);
	        dll.insertAtPosition(3, 30);  
	        System.out.print("After insertion: ");
	        printList(dll);
	    }
	    static void printList( doublylinkedlist dll) {
	    	doublylinkedlist.Node current = dll.getHead();
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
  }


	
