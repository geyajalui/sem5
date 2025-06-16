package day_7;

public class insertion_sort {
	   public static void main(String[] args) {
	        int[] arr = {9, 5, 1, 4, 3};

	        insertionSort(arr);
   System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void insertionSort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i]; 
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j]; 
	                j--;
	            }

	            arr[j + 1] = key; 
	        }
	    }
	}



