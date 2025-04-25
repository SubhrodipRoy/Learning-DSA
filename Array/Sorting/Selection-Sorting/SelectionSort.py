# Get the size of the array from the user
n = int(input("Enter the size of the array: "))

arr = []

# Get the elements of the array from the user
print("Enter the elements of the array: ")
for i in range(n):
    arr.append(int(input()))

# Print the original array
print("Original array:", arr)

# Selection Sort (Ascending Order)
for i in range(n - 1):
    min_idx = i
    for j in range(i + 1, n):
        if arr[j] < arr[min_idx]:
            min_idx = j

    # Swap the found minimum element with the first element
    arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Print the sorted array
print("Sorted array (Ascending Order):", arr)

# This program implements the Selection Sort algorithm in Python.