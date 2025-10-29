package Array;
import java.util.*;

public class array_swap {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter first index to swap (i): ");
        int i = scn.nextInt();

        System.out.print("Enter second index to swap (j): ");
        int j = scn.nextInt();

        // Call the swap function
        swap(arr, i, j);

        // Print the array after swapping
        System.out.println("Array after swapping:");
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
