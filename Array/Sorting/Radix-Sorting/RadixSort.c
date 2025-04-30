#include <stdio.h>

int getMax(int arr[], int n) {
    int max = arr[0];
    for(int i = 1; i < n; i++)
        if(arr[i] > max)
            max = arr[i];
    return max;
}

void countSort(int arr[], int n, int exp) {
    int output[n];
    int count[10] = {0};

    // Count occurrences
    for(int i = 0; i < n; i++)
        count[(arr[i] / exp) % 10]++;

    // Cumulative count
    for(int i = 1; i < 10; i++)
        count[i] += count[i - 1];

    // Build output array
    for(int i = n - 1; i >= 0; i--) {
        int digit = (arr[i] / exp) % 10;
        output[count[digit] - 1] = arr[i];
        count[digit]--;
    }

    // Copy back to original
    for(int i = 0; i < n; i++)
        arr[i] = output[i];
}

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter the elements of the array: ");
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Original array: ");
    for(int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    int max = getMax(arr, n);

    for(int exp = 1; max / exp > 0; exp *= 10)
        countSort(arr, n, exp);

    printf("\nSorted array: ");
    for(int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}

// This code implements the Radix Sort algorithm in C.
