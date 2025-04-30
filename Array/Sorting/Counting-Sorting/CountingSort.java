import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array (non-negative integers only): ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Original array: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }

            // Find the maximum element
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Create and initialize count array
            int[] count = new int[max + 1];
            for (int i = 0; i < n; i++) {
                count[arr[i]]++;
            }

            // Reconstruct the sorted array
            int index = 0;
            for (int i = 0; i <= max; i++) {
                while (count[i] > 0) {
                    arr[index++] = i;
                    count[i]--;
                }
            }

            System.out.print("\nSorted array: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
    }
}

// This program implements the Counting Sort algorithm in Java.
// ⚠️ This implementation assumes all elements are non-negative integers, as required by Counting Sort.
