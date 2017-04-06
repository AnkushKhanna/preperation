package gfg.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int terms = sc.nextInt();
            int arr[] = new int[terms];
            for (int t = 0; t < terms; t++) {
                arr[t] = sc.nextInt();
            }
            System.out.println(find(arr));
        }
    }

    public static int find(int[] arr)
    {
        int value = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            int v = find(arr, k);
            value = Math.max(v, value);
        }
        return value;
    }

    private static int find(int[] arr, int start)
    {
        int i = start, j = start;
        int value = 0;
        for (int k = start; k < arr.length; k++) {
            if (arr[i] <= arr[j]) {
                value++;
                i = j;
            }
            j++;
        }

        return value;
    }
}

class LIS
{
    static int max_lis_length; // stores the final LIS

    // Recursive implementation for calculating the LIS
    static int _lis(int arr[], int n)
    {
        // base case
        if (n == 1)
            return 1;

        int current_lis_length = 1;
        for (int i = 0; i < n - 1; i++) {
            // Recursively calculate the length of the LIS
            // ending at arr[i]
            int subproblem_lis_length = _lis(arr, i);

            // Check if appending arr[n-1] to the LIS
            // ending at arr[i] gives us an LIS ending at
            // arr[n-1] which is longer than the previously
            // calculated LIS ending at arr[n-1]
            if (arr[i] < arr[n - 1] &&
                current_lis_length < (1 + subproblem_lis_length))
                current_lis_length = 1 + subproblem_lis_length;
        }

        // Check if currently calculated LIS ending at
        // arr[n-1] is longer than the previously calculated
        // LIS and update max_lis_length accordingly
        if (max_lis_length < current_lis_length)
            max_lis_length = current_lis_length;

        return current_lis_length;
    }

    // The wrapper function for _lis()
    static int lis(int arr[], int n)
    {
        max_lis_length = 1; // stores the final LIS

        // max_lis_length is declared static above
        // so that it can maintain its value
        // between the recursive calls of _lis()
        _lis(arr, n);

        return max_lis_length;
    }

    // Driver program to test the functions above
    public static void main(String args[])
    {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int n = arr.length;
        System.out.println("Length of LIS is " + lis(arr, n));
    }
} // End of LIS class.

class LIS2
{
    /* lis() returns the length of the longest increasing
       subsequence in arr[] of size n */
    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;

          /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;

           /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

           /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    public static void main(String args[])
    {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n) + "\n");
    }
}

class LIS3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int terms = sc.nextInt();
            int arr[] = new int[terms];
            for (int t = 0; t < terms; t++) {
                arr[t] = sc.nextInt();
            }
            System.out.println(find(arr));
        }
    }

    public static int find(int[] arr)
    {
        int[] lisp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lisp[i] = 1;
        }
        find(arr, 0, lisp);

        return Arrays.stream(lisp).max().getAsInt();
    }

    private static void find(final int[] arr, final int index, int[] lisp)
    {
        if (index == arr.length) {
            return;
        }

        for (int j = 0; j < index; j++) {
            if (arr[j] < arr[index]) {
                lisp[index] = Math.max(lisp[j] + 1, lisp[index]);
            }
        }

        find(arr, index + 1, lisp);
    }
}
