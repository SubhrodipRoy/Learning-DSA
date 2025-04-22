#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int size;

    // Taking array size as input
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    // Allocating memory for the array
    int *arr = (int *)malloc(size * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Taking array elements as input
    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    // Linear (forward) traversal
    printf("Original array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Reverse traversal
    printf("Reversed array: ");
    for (int i = size - 1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Freeing allocated memory
    free(arr);

    return 0;
}
// This program demonstrates linear and reverse traversal of an array in C.
