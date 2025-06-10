package day_3;
class node2
{
   
	int data;
   node2 next;
   node2(int data) 
   {
        this.data = data;
    }
}

public class traverse
{
    public static void main(String[] args)
    {
        node2 head = new node2(10);
        head.next = new node2(20);
        head.next.next = new node2(30);
        node2 current = head;
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}


