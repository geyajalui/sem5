package day_8;

import java.util.Arrays;
import java.util.Scanner;

public class binary {
	public static void main(String []args) {
		int []arr= {32,87,80,89,90};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter a value to find its index");
		Scanner sc=new Scanner(System.in);
		int find=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		while(left<=right);
		int mid;
		while(left<=right);
		{
			mid=(left+right)/2;
			if(arr[mid]==find)
			{
				System.out.println("value found"+arr[mid]+"at index");
			}
			else if(find>arr[mid])
			{
				left=mid+1;
				
			}
			else if(find>arr[mid])
			{
				right=mid-1;
			}
		}
	}

}
