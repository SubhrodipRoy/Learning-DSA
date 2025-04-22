def main():
    # Input the size of the array
    n = int(input("Enter the size of the list: "))

    # Input the elements
    arr = []
    print("Enter the elements of the list:")
    for _ in range(n):
        arr.append(int(input()))

    # Display the original list
    print("The elements of the list are:", arr)

    # Input the target difference
    x = int(input("Enter a positive number: "))

    # Find and print pairs with the given difference
    print(f"The following pairs of elements give us a difference of {x}:")
    for i in range(n - 1):
        for j in range(i + 1, n):
            if abs(arr[j] - arr[i]) == x:
                print(f"({arr[i]}, {arr[j]});", end=' ')

if __name__ == "__main__":
    main()
