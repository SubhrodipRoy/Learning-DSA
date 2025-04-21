#include <stdio.h>

int main() {
    int size, i, element, index;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    // Create array with one extra space for insertion
    int arr[100];  // assuming maximum size is 100

    // Input the elements
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

    // Get element and index for insertion
    printf("Enter the element to insert: ");
    scanf("%d", &element);

    printf("Enter the index to insert the element at (0 to %d): ", size);
    scanf("%d", &index);

    // Validate index
    if (index < 0 || index > size) {
        printf("Invalid index!\n");
        return 1;
    }

    // Shift elements to the right
    for (i = size; i > index; i--) {
        arr[i] = arr[i - 1];
    }

    // Insert the element
    arr[index] = element;
    size++;  // increase the size

    // Print the updated array
    printf("Array after insertion: ");
    for (i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
// This program inserts an element at a specified index in an array.
