def main():
    # Get the size of the list
    size = int(input("Enter the size of the list: "))
    
    # Input the elements
    arr = []
    print(f"Enter {size} elements:")
    for i in range(size):
        arr.append(int(input()))

    # Print the original list
    print("Original list:", arr)

    # Get the element and index for insertion
    element = int(input("Enter the element to insert: "))
    index = int(input(f"Enter the index to insert the element at (0 to {size}): "))

    # Validate index
    if index < 0 or index > size:
        print("Invalid index!")
        return

    # Insert the element at the specified index
    arr.insert(index, element)

    # Print the updated list
    print("List after insertion:", arr)

if __name__ == "__main__":
    main()

# This program inserts an element into a list at a specified index. 