package day_5;

public class circularlinkedlist {
		    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head = null;
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            newNode.next = head;
	        } else {
	            Node temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	    }
	    public Node getHead() {
	        return head;
	    }

		public void insertAtTail(int i) {
			  Node newNode = new Node(i);

		        if (head == null) {
		            head = newNode;
		            newNode.next = head;
		        } else {
		            Node temp = head;
		            while (temp.next != head) {
		                temp = temp.next;
		            }
		            temp.next = newNode;
		            newNode.next = head;
		        }
		    }
			
		}
	




