import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] temp = new int[n];

            for (int size = 1; size < n; size *= 2) {
                for (int left = 0; left < n - size; left += 2 * size) {
                    int mid = left + size - 1;
                    int right = Math.min(left + 2 * size - 1, n - 1);

                    int i = left, j = mid + 1, k = left;

                    while (i <= mid && j <= right) {
                        if (arr[i] <= arr[j]) {
                            temp[k++] = arr[i++];
                        } else {
                            temp[k++] = arr[j++];
                        }
                    }

                    while (i <= mid) {
                        temp[k++] = arr[i++];
                    }

                    while (j <= right) {
                        temp[k++] = arr[j++];
                    }

                    for (int x = left; x <= right; x++) {
                        arr[x] = temp[x];
                    }
                }
            }

            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// This code implements the merge sort algorithm in Java.
