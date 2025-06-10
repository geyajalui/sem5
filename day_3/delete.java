package day_3;
class node1 {
 int data;
    node1 next;
    node1(int data) { this.data = data; 
    }
}
public class delete 
{
    public static void main(String[] args)
    {	       
        node1 head = new node1(1);
        head.next = new node1(2);
        head.next.next = new node1(3);
        int pos = 1;
        if (pos == 0) 
        {
  head = head.next; 
        }
        else 
        {
    node1 temp = head;
            for (int i = 0; i < pos - 1 && temp != null; i++)
                temp = temp.next;
            if (temp != null && temp.next != null)
               temp.next = temp.next.next;
        }       
node1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }        

    }
}

