package maxsumsubarray;

public class MaximumSumSubArray
{
    public int max(int[] arr)
    {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i : arr)
        {
            max_ending_here = max_ending_here + i;
            max_so_far = Math.max(max_so_far, max_ending_here);
            max_ending_here = Math.max(0, max_ending_here);
        }
        return max_so_far;
    }
}
