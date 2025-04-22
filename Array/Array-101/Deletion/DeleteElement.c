#include <stdio.h>

int main() {
    int size, index, i;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    // Declare the array
    int arr[size];

    // Input the elements of the array
    printf("Enter %d elements:\n", size);
    for (i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    // Print the original array
    printf("Original array: ");
    for (i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Get the index to delete
    printf("Enter the index of the element to delete (0 to %d): ", size - 1);
    scanf("%d", &index);

    // Validate the index
    if (index < 0 || index >= size) {
        printf("Invalid index!\n");
        return 1;
    }

    // Shift elements to the left to delete the element at the specified index
    for (i = index; i < size - 1; i++) {
        arr[i] = arr[i + 1];
    }

    // Print the updated array after deletion
    printf("Array after deletion: ");
    for (i = 0; i < size - 1; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
// This program deletes an element from an array at a specified index.
