package day_2;
import java.util.Scanner;

public class decending_sort {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many spaces do you need? ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        int[] sortedArray = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }
       for (int i = 0; i < size; i++) {
            sortedArray[i] = originalArray[i];
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sortedArray[i] < sortedArray[j]) {                  
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
       System.out.print("\nSorted (Descending) Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}



