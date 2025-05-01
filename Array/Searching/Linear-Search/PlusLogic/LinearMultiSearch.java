import java.util.Scanner;

public class LinearMultiSearch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the element to search: ");
            int target = scanner.nextInt();

            boolean found = false;
            System.out.print("Element " + target + " found at index/indices: ");
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    System.out.print(i + " ");
                    found = true;
                }
            }

            if (!found) {
                System.out.print("Element not found in the array.");
            }

            System.out.println();
        }
    }
}
