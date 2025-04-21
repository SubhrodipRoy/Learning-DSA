import java.util.Scanner;

public class InsertElement 
{

    public static void main(String[] args) {
        // Get the size of the array
        try (Scanner sc = new Scanner(System.in)) {
            // Get the size of the array
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            
            // Create an array to hold the elements
            int[] arr = new int[size + 1]; // +1 for the new element
            
            // Input the elements
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Print the original array
            System.out.print("Original array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            
            // Get the element and index for insertion
            System.out.print("Enter the element to insert: ");
            int element = sc.nextInt();
            
            System.out.print("Enter the index to insert the element at (0 to " + size + "): ");
            int index = sc.nextInt();
            
            // Validate index
            if (index < 0 || index > size) {
                System.out.println("Invalid index!");
                sc.close();
                return;
            }
            
            // Shift elements to the right
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            
            // Insert the element at the specified index
            arr[index] = element;
            
            // Print the updated array
            System.out.print("Array after insertion: ");
            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// This program inserts an element at a specified index in an array.
