package gfg.dynamicprogramming;

import java.util.Scanner;

public class MaximumSubarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }
            System.out.println(maxSum(arr));
            System.out.println(nonCSum2(arr));
        }
    }

    public static int maxSum(int[] arr)
    {
        if (arr.length == 0) {
            return 0;
        }

        int[] sum = new int[arr.length];

        sum[0] = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum[i] = arr[i];

            if (sum[i] < sum[i] + sum[i - 1]) {
                sum[i] = sum[i] + sum[i - 1];
            }
            maxSum = Math.max(maxSum, sum[i]);
        }

        return maxSum;
    }

    public static int nonCSum(int[] arr)
    {
        if (arr.length == 0) {
            return 0;
        }

        int[] sum = new int[arr.length];

        sum[0] = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum[i] = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (sum[i] < arr[i] + sum[j]) {
                    sum[i] = arr[i] + sum[j];
                }
            }
            maxSum = Math.max(maxSum, sum[i]);
        }

        return maxSum;
    }

    public static int nonCSum2(int[] arr)
    {
        if (arr.length == 0) {
            return 0;
        }

        int maxSum = 0;
        int largest = arr[0];
        boolean allfalse = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                maxSum = maxSum + arr[i];
                allfalse = false;
            }
            largest = Math.max(largest, arr[i]);
        }

        return allfalse ? largest : maxSum;
    }
}
