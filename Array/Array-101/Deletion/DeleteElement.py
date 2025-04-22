def main():
    # Accept the size of the array
    size = int(input("Enter the size of the list: "))

    # Input the elements
    arr = []
    print(f"Enter {size} elements:")
    for _ in range(size):
        arr.append(int(input()))

    # Print the original list
    print("Original list:", arr)

    # Get the index to delete
    index = int(input(f"Enter the index of the element to delete (0 to {size - 1}): "))

    # Validate index
    if index < 0 or index >= size:
        print("Invalid index!")
    else:
        # Delete the element at the specified index
        deleted = arr.pop(index)

        # Print the updated list
        print(f"Element {deleted} deleted.")
        print("List after deletion:", arr)

# Call main function
if __name__ == "__main__":
    main()

# This program allows the user to delete an element from a list by specifying its index.
