package day_4;
public class doublylinkedlist{
	static class Node 
	{
      int data;
     Node prev;
  Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    private Node head;
    public void append(int data) 
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
          while (current.next != null) 
          {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    public Node getHead()
    {
        return head;
    }
	public void insertAtPosition(int i, int j)
	{
		{
			 Node newNode = new Node(j);
		        if (i <= 1 || head == null)
		        {
		        	newNode.next = head;
		            if (head != null)
		            {
		                head.prev = newNode;
		            }
		            head = newNode;
		            return;
		        }
		        Node current = head;
		        int count = 1;
		        while (current.next != null && count < i - 1) 
		        {
		            current = current.next;
		            count++;
		        }
		        newNode.next = current.next;
		        if (current.next != null) 
		        {
		            current.next.prev = newNode;
		        }
		        current.next = newNode;
		        newNode.prev = current;
		}
	}
	public void deleteAtPosition(int i)
	{
		 if (head == null || i <= 0) return;  
	        Node current = head;
	        int count = 1;
	        if (i == 1)
	        {
	            head = current.next;
	            if (head != null)
	            {
	                head.prev = null;
	            }
	            return;
	        }
	      	        while (current != null && count < i) 
	      	        {
	            current = current.next;
	            count++;
	        }
	        if (current == null) return;
	     	        if (current.next != null) 
	     	        {
	            current.next.prev = current.prev;
	        }
	        if (current.prev != null)
	        {
	            current.prev.next = current.next;
	            }
	        }
	        public void traverseForward() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	        public void traverseBackward() {
	            if (head == null) return;
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.prev;
	            }
	            System.out.println();
	         	}
}

