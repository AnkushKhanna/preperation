package maxsumsubarray;

public class MaxSumSubArray
{
    public int findMaximum(int[] arr)
    {
        return findMaximum(arr, arr.length - 1);
    }

    private int findMaximum(int[] arr, int i)
    {
        if (i == 0) {
            return arr[0];
        }
        if (i == 1) {
            return Math.max(arr[0], arr[1]);
        }

        return Math.max(findMaximum(arr, i - 1), arr[i] + findMaximum(arr, i - 2));
    }
}
