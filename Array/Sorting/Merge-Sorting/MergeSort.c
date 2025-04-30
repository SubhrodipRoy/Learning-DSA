#include <stdio.h>

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Original array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");

    // Merge sort implementation in main
    int temp[n];

    // Bottom-up merge sort (iterative)
    for (int size = 1; size < n; size *= 2) {
        for (int left = 0; left < n - size; left += 2 * size) {
            int mid = left + size - 1;
            int right = (left + 2 * size - 1 < n) ? (left + 2 * size - 1) : (n - 1);

            int i = left, j = mid + 1, k = left;

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j])
                    temp[k++] = arr[i++];
                else
                    temp[k++] = arr[j++];
            }

            while (i <= mid)
                temp[k++] = arr[i++];
            while (j <= right)
                temp[k++] = arr[j++];

            for (int x = left; x <= right; x++)
                arr[x] = temp[x];
        }
    }

    printf("Sorted array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");

    return 0;
}

// This code implements the merge sort algorithm in C.
