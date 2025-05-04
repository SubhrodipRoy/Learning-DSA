def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                # Swap arr[j] and arr[j + 1]
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


def binary_search(arr, key):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = low + (high - low) // 2

        # Check if key is present at mid
        if arr[mid] == key:
            return mid  # Key found at index mid

        # If key is smaller than mid, then search the left half
        elif arr[mid] > key:
            high = mid - 1

        # Otherwise, search the right half
        else:
            low = mid + 1

    return -1  # Key not found


def main():
    # Taking array input from the user
    n = int(input("Enter the size of the array: "))
    arr = []

    print("Enter the elements of the array:")
    for _ in range(n):
        arr.append(int(input()))

    # Perform Bubble Sort
    bubble_sort(arr)

    # Print the sorted array
    print("Sorted array:")
    print(arr)

    # Perform Binary Search
    key = int(input("Enter the element to search for: "))

    result = binary_search(arr, key)

    if result == -1:
        print("Element not found.")
    else:
        print(f"Element found at index: {result}")


if __name__ == "__main__":
    main()
