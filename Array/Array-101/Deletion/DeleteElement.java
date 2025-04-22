import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        // Use try-with-resources to handle Scanner automatically
        try (Scanner sc = new Scanner(System.in)) {
            // Get the size of the array
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare and input the array
            int[] arr = new int[size];
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

            // Get the index to delete
            System.out.print("Enter the index of the element to delete (0 to " + (size - 1) + "): ");
            int index = sc.nextInt();

            // Validate index
            if (index < 0 || index >= size) {
                System.out.println("Invalid index!");
                return;
            }

            // Create a new array with one less element
            int[] newArr = new int[size - 1];

            // Copy elements except the one at the given index
            for (int i = 0, j = 0; i < size; i++) {
                if (i == index) continue;
                newArr[j++] = arr[i];
            }

            // Print the updated array
            System.out.print("Array after deletion: ");
            for (int val : newArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
// This program allows the user to delete an element from an array by specifying its index.
