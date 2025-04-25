# Input the size of the array
n = int(input("Enter the size of the array: "))

# Input the array elements
arr = []
print(f"Enter {n} elements:")
for _ in range(n):
    arr.append(int(input()))

# Print original array
print("Original array:", arr)

# Bubble sort (ascending order)
for i in range(n - 1):
    for j in range(n - 1 - i):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Print sorted array
print("Sorted array:", arr)

# Bubble Sort algorithm implemented in Python