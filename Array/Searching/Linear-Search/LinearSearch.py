# Linear Search in Python

# Take input for size of array
n = int(input("Enter the size of the array: "))
arr = []

# Take array elements one by one
print("Enter the elements of the array:")
for i in range(n):
    num = int(input())
    arr.append(num)

# Print original array
print("Original array:", *arr)

# Take target element to search
target = int(input("Enter the element to search for: "))

# Perform linear search
found = False
for i in range(n):
    if arr[i] == target:
        print(f"Element {target} found at index {i}.")
        found = True
        break

if not found:
    print(f"Element {target} not found in the array.")

# This code implements a linear search algorithm in Python.