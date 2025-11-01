package Array;
import java.util.*;

import java.util.Scanner;

public class diff_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = scn.nextInt();

        // ✅ Step 1: Determine which number is bigger
        boolean negative = false;
        if (isSmaller(arr1, arr2)) {
            // swap arrays so arr2 is always larger
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
            negative = true;
        }

        // ✅ Step 2: Perform subtraction
        int n = arr1.length;
        int m = arr2.length;
        int diff[] = new int[n];
        int c = 0;

        int i = n - 1, j = m - 1, k = n - 1;

        while (k >= 0) {
            int d = arr1[i] + c;
            if (j >= 0) d -= arr2[j];

            if (d < 0) {
                d += 10;
                c = -1;
            } else {
                c = 0;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        // ✅ Step 3: Remove leading zeros
        int idx = 0;
        while (idx < diff.length - 1 && diff[idx] == 0) idx++;

        // ✅ Step 4: Print result
        if (negative) System.out.print("-");
        for (int p = idx; p < diff.length; p++) System.out.print(diff[p]);
        System.out.println();

        scn.close();
    }

    // ✅ Helper function: compare two arrays as numbers
    static boolean isSmaller(int[] num1, int[] num2) {
        if (num1.length != num2.length)
            return num1.length < num2.length;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] < num2[i]) return true;
            else if (num1[i] > num2[i]) return false;
        }
        return false;

    }

}
