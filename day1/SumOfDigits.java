package day_1;
import java.util.*;

public class SumOfDigits {
	public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int result = sumOfDigits(input);
        System.out.println("Sum of digits: " + result);

        scanner.close();
    }
}


