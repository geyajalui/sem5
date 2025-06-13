package day_6;

public class stack {
 int mystack[]=new int[5];
 int top=-1;
 public void push (int num)
 {
	 if(top==4)
	 {
		 System.out.println("stack overflow");
	 }
	 
 }
public void pop()
{
	if(top<0)
	{
		System.out.println("underflow");
	}
	else
		{
		System.out.println(mystack[top]+"popped out");
		--top;
	}
}

	
}