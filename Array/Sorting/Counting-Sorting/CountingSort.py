# Counting Sort in Python

# Take size and elements as input
n = int(input("Enter the size of the array: "))
arr = []

print("Enter the elements of the array (non-negative integers only):")
for _ in range(n):
    arr.append(int(input()))

print("Original array:", *arr)

# Find the maximum element
max_val = max(arr)

# Create and initialize count array
count = [0] * (max_val + 1)
for num in arr:
    count[num] += 1

# Reconstruct the sorted array
sorted_arr = []
for i in range(len(count)):
    sorted_arr.extend([i] * count[i])

print("Sorted array:", *sorted_arr)
