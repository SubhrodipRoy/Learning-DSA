
# Input array from user
n = int(input("Enter the size of the array: "))
arr = []
print("Enter the elements of the array: ")
for _ in range(n):
    arr.append(int(input()))

print("Original array:", *arr)

# Function to get maximum value
max_val = max(arr)

exp = 1  # Exponent for digit place (1s, 10s, 100s, ...)
while max_val // exp > 0:
    count = [0] * 10
    output = [0] * n

    # Count occurrences of digits at current place
    for num in arr:
        index = (num // exp) % 10
        count[index] += 1

    # Cumulative count
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Build output array
    for i in range(n - 1, -1, -1):
        index = (arr[i] // exp) % 10
        output[count[index] - 1] = arr[i]
        count[index] -= 1

    # Copy output back to arr
    arr = output[:]
    exp *= 10

print("Sorted array: ", *arr)

# This code implements the Radix Sort algorithm in Python.
