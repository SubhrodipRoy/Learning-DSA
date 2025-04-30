import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Print original array
            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            // Iterative quick sort
            int[] stack = new int[n];
            int top = -1;

            stack[++top] = 0;
            stack[++top] = n - 1;

            while (top >= 0) {
                int high = stack[top--];
                int low = stack[top--];

                int pivot = arr[high];
                int i = low - 1;

                for (int j = low; j < high; j++) {
                    if (arr[j] < pivot) {
                        i++;
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

                int temp = arr[i + 1];
                arr[i + 1] = arr[high];
                arr[high] = temp;

                int pi = i + 1;

                if (pi - 1 > low) {
                    stack[++top] = low;
                    stack[++top] = pi - 1;
                }

                if (pi + 1 < high) {
                    stack[++top] = pi + 1;
                    stack[++top] = high;
                }
            }

            // Print sorted array
            System.out.print("\nSorted array (Ascending Order): ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}

// This program implements the Quick Sort algorithm in Java