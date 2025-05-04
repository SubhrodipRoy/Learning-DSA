import java.util.Scanner;

public class BinarySearch {

    // Function to perform bubble sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to perform binary search
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found at index mid
            }
            
            // If key is smaller than mid, then search the left half
            if (arr[mid] > key) {
                high = mid - 1;
            }
            // Otherwise, search the right half
            else {
                low = mid + 1;
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform Binary Search
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();
        
        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}

// This program first sorts an array using bubble sort in java.
