package day_1;
import java.util.Scanner;

public class factorial_fibonacci {
		   static int factorial(int n) {
		       if (n == 1 || n == 0) {
		           return 1;  
		       }
		       return n * factorial(n - 1);  
		   }

		 
		   static int fibonacci(int n) {
		       if (n == 0) {
		           return 0;  
		       }
		       if (n == 1) {
		           return 1;  
		       }
		       return fibonacci(n - 1) + fibonacci(n - 2);  
		   }

		   public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       System.out.print("Enter number for factorial: ");
		       int num1 = sc.nextInt();
		       System.out.println("Factorial of " + num1 + " is: " + factorial(num1));
		       System.out.print("Enter number of Fibonacci terms: ");
		       int num2 = sc.nextInt();
		       System.out.println("Fibonacci series:");
		       for (int i = 0; i < num2; i++) {
		           System.out.print(fibonacci(i) + " ");
		       }

		       sc.close();
		   }
		}





