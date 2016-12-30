public class LargestDifference
{
    public static int largestDifference(int[] data)
    {
        return largestDifference(data, 0, data.length, 0);
    }

    private static int largestDifference(int[] data, int start, int end, int max)
    {
        if (start + max > end) {
            return max;
        }

        int tmpMax = max;
        for (int i = start + max; i < end; i++) {
            if (data[start] <= data[i]) {
                if (i - start > max) {
                    tmpMax = i - start;
                }
            }
        }

        return largestDifference(data, start + 1, end, tmpMax);
    }

    public static void main(String[] args)
    {
        System.out.println(LargestDifference.largestDifference(new int[]{78,88,64,94,17,91,57,69,38,62,13,17,35,15,20}));
        System.out.println(LargestDifference.largestDifference(new int[]{3, 2, 1}));
        System.out.println(LargestDifference.largestDifference(new int[]{9, 4, 1, 10, 3, 4, 0, -1, -2}));

    }
}
