import java.util.Scanner;

public class difference_pairs 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input the size of the array
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            // Create the array
            int[] arr = new int[n];

            // Input the elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Display the array
            System.out.print("The elements of the array are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            // Input the target difference
            System.out.print("\nEnter a positive number: ");
            int x = sc.nextInt();

            // Find and display the pairs with the specified difference
            System.out.println("The following pairs of elements give us a difference of " + x + ":");
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int diff = Math.abs(arr[j] - arr[i]);
                    if (diff == x) {
                        System.out.print("(" + arr[i] + ", " + arr[j] + "); ");
                    }
                }
            }
        }
    }
}
