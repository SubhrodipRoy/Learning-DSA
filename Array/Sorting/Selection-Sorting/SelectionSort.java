import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            // Get the size of the array from the user
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Get the elements of the array from the user
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Print the original array
            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Selection Sort (Ascending Order)
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }

            // Print the sorted array
            System.out.print("Sorted array (Ascending Order): ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }   
    }
}

// This program implements the Selection Sort algorithm in Java.