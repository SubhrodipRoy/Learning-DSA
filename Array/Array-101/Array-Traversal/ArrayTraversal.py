def main():
    # Taking array size as input
    size = int(input("Enter the size of the array: "))

    # Taking array elements as input
    arr = []
    print(f"Enter {size} elements:")
    for _ in range(size):
        num = int(input())
        arr.append(num)

    # Linear (forward) traversal
    print("Original array:", ' '.join(map(str, arr)))

    # Reverse traversal
    print("Reversed array:", ' '.join(map(str, arr[::-1])))

if __name__ == "__main__":
    main()
# This code demonstrates linear and reverse traversal of an array in Python.