
# Take input from the user
size = int(input("Enter the size of the array: "))
arr = []

print("Enter the elements of the array:")
for _ in range(size):
    arr.append(int(input()))

# Print original array
print("Original array:", arr)

# Perform insertion sort
for i in range(1, size):
    key = arr[i]
    j = i - 1
    while j >= 0 and arr[j] > key:
        arr[j + 1] = arr[j]
        j -= 1
    arr[j + 1] = key

# Print sorted array
print("Sorted array:", arr)

#This program implements the Insertion Sort algorithm in Python.