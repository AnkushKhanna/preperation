package sorting;

public class MergeSort
{
    public int[] mergeSort(int[] arr, int start, int end)
    {
        if (start < end - 1) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle, end);
            merge(arr, start, middle, end);
        }

        return arr;
    }

    private void merge(int[] arr, int start, int middle, int end)
    {
        int n1 = middle - start;
        int n2 = end - middle;

        int[] leftArr = new int[n1 + 1];
        int[] rightArr = new int[n2 + 1];

        System.arraycopy(arr, start, leftArr, 0, n1);
        System.arraycopy(arr, middle, rightArr, 0, n2);

        leftArr[n1] = Integer.MAX_VALUE;
        rightArr[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = start; k < end; k++) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
        }
    }
}
