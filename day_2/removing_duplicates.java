package day_2;

public class removing_duplicates {
	public static int removeDuplicates(int[] arr) {
	       if (arr.length == 0) return 0;

	       int i = 0;

	       for (int j = 1; j < arr.length; j++) {
	           if (arr[j] != arr[i]) {
	               i++;
	               arr[i] = arr[j];
	           }
	       }

	       return i + 1;
	   }

	   public static void main(String[] args) {
	       int[] arr = {2,3,4,4,5,8,2,3};

	       int newLength = removeDuplicates(arr);

	       System.out.print("Array after removing duplicates: ");
	       for (int i = 0; i < newLength; i++) {
	           System.out.print(arr[i] + " ");
	       }
	   }
	}



