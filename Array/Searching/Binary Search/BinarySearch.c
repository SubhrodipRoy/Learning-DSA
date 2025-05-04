#include <stdio.h>

// Function to perform Bubble Sort
void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for(i = 0; i < n - 1; i++) {
        for(j = 0; j < n - i - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                // Swap
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    int arr[100], n, i, target;
    int low, high, mid;
    int found = 0;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter %d elements of the array:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Sort the array
    bubbleSort(arr, n);

    printf("Sorted array: ");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Binary Search
    printf("Enter the element to search for: ");
    scanf("%d", &target);

    low = 0;
    high = n - 1;
    while(low <= high) {
        mid = (low + high) / 2;

        if(arr[mid] == target) {
            printf("Element found at index %d.\n", mid);
            found = 1;
            break;
        }
        else if(arr[mid] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    if(!found) {
        printf("Element not found in the array.\n");
    }

    return 0;
}

// This code implements a binary search algorithm in C.
