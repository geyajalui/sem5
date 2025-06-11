package day_4;

public class traverse {
	    public static void main(String[] args) {
	        doublylinkedlist dll = new doublylinkedlist();
	        dll.append(10);
	        dll.append(20);
	        dll.append(30);
	        dll.append(40);

	        System.out.print("Traverse forward: ");
	        dll.traverseForward(); 

	        System.out.print("Traverse backward: ");
	        dll.traverseBackward();
	    }
	}



