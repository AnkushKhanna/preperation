package maxsumsubarray;

import scala.Int;

import java.util.Arrays;

public class MaxSumNonAdjacentMemorize
{
    public int findMaximum(int[] arr)
    {
        int[] memorize = new int[arr.length];

        Arrays.fill(memorize, Int.MinValue());

        return findMaximum(arr, arr.length - 1, memorize);
    }

    private int findMaximum(int[] arr, int i, int[] memorize)
    {
        if (memorize[i] != Int.MinValue()) {
            return memorize[i];
        }

        if (i == 0) {
            memorize[0] = arr[0];
        } else if (i == 1) {
            memorize[i] = Math.max(arr[0], arr[1]);
        } else {
            memorize[i] = Math.max(findMaximum(arr, i - 1, memorize), arr[i] + findMaximum(arr, i - 2, memorize));
        }

        return memorize[i];
    }
}
