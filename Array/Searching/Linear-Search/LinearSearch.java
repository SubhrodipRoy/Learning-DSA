import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input size of array
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input elements of array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Display original array
            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Input target to search
            System.out.print("Enter the element to search for: ");
            int target = sc.nextInt();

            // Perform linear search
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    System.out.println("Element " + target + " found at index " + i + ".");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Element " + target + " not found in the array.");
            }
        }
    }
}

// This code implements a simple linear search algorithm in Java.