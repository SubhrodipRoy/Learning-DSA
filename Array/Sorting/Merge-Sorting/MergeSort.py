
# Input
n = int(input("Enter the size of the array: "))
arr = []
print("Enter the elements of the array:")
for _ in range(n):
    arr.append(int(input()))

print("Original array:", *arr)

# Merge Sort logic
temp = [0] * n
size = 1

while size < n:
    for left in range(0, n - size, 2 * size):
        mid = left + size - 1
        right = min(left + 2 * size - 1, n - 1)

        i, j, k = left, mid + 1, left

        while i <= mid and j <= right:
            if arr[i] <= arr[j]:
                temp[k] = arr[i]
                i += 1
            else:
                temp[k] = arr[j]
                j += 1
            k += 1

        while i <= mid:
            temp[k] = arr[i]
            i += 1
            k += 1

        while j <= right:
            temp[k] = arr[j]
            j += 1
            k += 1

        for x in range(left, right + 1):
            arr[x] = temp[x]

    size *= 2

print("Sorted array:", *arr)

# This code implements the merge sort algorithm in Python.
