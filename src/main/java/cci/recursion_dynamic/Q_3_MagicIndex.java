package cci.recursion_dynamic;

public class Q_3_MagicIndex
{
    public static int magicIndex(int[] arr)
    {
        return magicIndex(arr, 0, arr.length - 1);
    }

    private static int magicIndex(int[] arr, int start, int end)
    {
        if (start > end) {
            return -1;
        }

        int m = (start + end) / 2;

        if (arr[m] == m)
            return m;

        if (arr[m] > m)
            return magicIndex(arr, start, m);

        return magicIndex(arr, m, end);
    }

    public static void main(String[] args)
    {
        System.out.println(magicIndex(new int[]{
            -40, -20, -1, 1, 2, 3, 6, 7, 9, 12, 13
        }));
    }
}
