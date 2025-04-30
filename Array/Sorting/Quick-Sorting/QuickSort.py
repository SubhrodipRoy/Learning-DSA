# Accepting array input from the user
n = int(input("Enter the size of the array: "))
arr = []
for i in range(n):
        element = int(input(f"Element {i + 1}: "))
        arr.append(element)

# Printing the original array
print("Original array:", *arr)

# Implementing Quick Sort (iterative approach)
stack = [(0, n - 1)]

while stack:
    low, high = stack.pop()
    if low < high:
        pivot = arr[high]
        i = low - 1
        for j in range(low, high):
            if arr[j] < pivot:
                i += 1
                arr[i], arr[j] = arr[j], arr[i]
        arr[i + 1], arr[high] = arr[high], arr[i + 1]
        pi = i + 1

        stack.append((low, pi - 1))
        stack.append((pi + 1, high))

# Printing the sorted array
print("Sorted array (Ascending Order):", *arr)

# This program implements the Quick Sort algorithm in Python