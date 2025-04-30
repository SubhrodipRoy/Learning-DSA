import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            // Find the maximum number to determine the number of digits
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }

            // Perform counting sort for every digit
            for (int exp = 1; max / exp > 0; exp *= 10) {
                int[] output = new int[n];
                int[] count = new int[10];

                // Count occurrences of digits
                for (int i = 0; i < n; i++) {
                    int digit = (arr[i] / exp) % 10;
                    count[digit]++;
                }

                // Cumulative count
                for (int i = 1; i < 10; i++) {
                    count[i] += count[i - 1];
                }

                // Build the output array
                for (int i = n - 1; i >= 0; i--) {
                    int digit = (arr[i] / exp) % 10;
                    output[count[digit] - 1] = arr[i];
                    count[digit]--;
                }

                // Copy output to arr
                for (int i = 0; i < n; i++) {
                    arr[i] = output[i];
                }
            }

            System.out.print("\nSorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}

// This code implements the Radix Sort algorithm in Java.
