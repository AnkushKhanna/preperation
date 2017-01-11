import java.util.Arrays;

public class PartitioningProblem
{
    public boolean partition(int[] arr)
    {
        int sum = Arrays.stream(arr).sum();
        if (sum % 2 != 0) {
            return false;
        }

        return partition(arr, arr.length - 1, sum / 2);
    }

    private boolean partition(final int[] arr, int index, final int sum)
    {
        if (index == 0) {
            return sum == arr[0];
        }

        return partition(arr, index - 1, sum) || partition(arr, index - 1, sum - arr[index]);
    }
}
