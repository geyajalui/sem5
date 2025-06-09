package day_1;

public class array_operations {
	public static void main(String[] args) {
        int[] array = new int[10];  
        array[0] = 24;
        array[1] = 05;
        array[2] = 10;
        array[3] = 14;
        int size = 4;  
     
        System.out.println("given Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int insertPosition = 2;
        int insertValue = 25;
        for (int i = size; i > insertPosition; i--) {
            array[i] = array[i - 1];  
        }
        array[insertPosition] = insertValue;
        size++;  
        System.out.println("After Inserting:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int deletePosition = 3;
        for (int i = deletePosition; i < size - 1; i++) {
            array[i] = array[i + 1];  
        }
        size--;

        System.out.println("After Deleting:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        array[1] = 44;

        System.out.println("After Updation:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}



