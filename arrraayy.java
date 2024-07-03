import java.util.Scanner;
public class arrraayy {
        public static void main(String[] args) {
            // Declare and initialize an array of integers
            int[] numbers = { 1, 2, 3, 4, 5 };
            // Print array elements
            System.out.println("Array elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
    
            // Calculate sum of array elements
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
    
            // Print the sum
            System.out.println("Sum of array elements: " + sum);
        }
    }
    


