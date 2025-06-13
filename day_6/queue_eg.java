package day_6;

import java.util.Arrays;

public class queue_eg {
	int []arr=new int[5];
	int rear;
	int front;
	 
	public queue_eg() {
		rear=-1;
		front=-1;
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("queue spreadout");
		}
			arr[++rear]=num;
	}

public void dequeue() {
	if(front==4) {
		System.out.println("empty queue");
	}
	else
	{
		arr[front++]=0;
	}
}
	public void display() {
		System.out.println(Arrays.toString(arr));
		
	}
}
