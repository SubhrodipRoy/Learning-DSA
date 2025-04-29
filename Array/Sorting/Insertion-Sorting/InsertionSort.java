import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input array size
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Print original array
            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Insertion Sort
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }

            // Print sorted array
            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// This program implements the Insertion Sort algorithm in Java.