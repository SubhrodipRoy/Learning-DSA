#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, n, diff;

    // Ask the user for the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    // Declare an array of size n
    int arr[n];

    // Input elements into the array
    printf("Enter the elements of the array: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // Display the original array
    printf("The elements of the array are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    // Ask the user to enter a positive number for difference
    printf("\nEnter a positive number: ");
    scanf("%d", &x);

    // Print pairs of elements with the given difference
    printf("The following pairs of elements give us a difference of %d:\n", x);
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            // Calculate absolute difference between arr[i] and arr[j]
            diff = abs(arr[j] - arr[i]);

            // Check if the absolute difference matches x
            if (diff == x)
            {
                printf("(%d, %d);", arr[i], arr[j]);
            }
        }
    }
}
