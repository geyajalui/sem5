package day_7;
public class quick_sort {
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 6};
	        quickSort(arr, 0, arr.length - 1);
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	    public static void quickSort(int[] a, int low, int high) {
	        if (low < high) {
	            int p = partition(a, low, high);
	            quickSort(a, low, p - 1);
	            quickSort(a, p + 1, high);
	        }
	    }
	    public static int partition(int[] a, int low, int high) {
	        int pivot = a[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (a[j] < pivot) {
	                i++;
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	        int temp = a[i + 1];
	        a[i + 1] = a[high];
	        a[high] = temp;
	        return i + 1;
	    }
	}



