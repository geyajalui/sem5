package day_8;

import java.util.Arrays;
import java.util.Scanner;

public class linear {
	public static void main(String[]args) {
	int arr[]= {55,67,93,76,65};
	System.out.println(Arrays.toString(arr));
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a value to find:");
	int find=sc.nextInt();
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]==find)
		{
			System.out.println("value found:"+arr[i]+"at index"+i);
			return;
		}
		else {
			System.out.println("value not found");
			break;
		}
	}
	
	
}
	}
