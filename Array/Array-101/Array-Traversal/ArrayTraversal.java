
import java.util.Scanner;

public class ArrayTraversal 
{
    public static void main(String[] args) {
        // Using try-with-resources to ensure Scanner is closed automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Taking array size as input
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declaring the array
            int[] arr = new int[size];

            // Taking array elements as input
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Linear (forward) traversal
            System.out.print("Original array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();

            // Reverse traversal
            System.out.print("Reversed array: ");
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
// This program demonstrates linear and reverse traversal of an array in Java.