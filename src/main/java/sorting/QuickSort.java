package sorting;

import java.util.Random;

public class QuickSort
{
    private Random rand = new Random();

    public void sort(int[] arr)
    {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end)
    {
        if (start < end) {
            int middle = partition(arr, start, end);
            sort(arr, start, middle - 1);
            sort(arr, middle + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end)
    {
        int randomNumber = rand.nextInt((end - start) + 1) + start;
        exchange(arr, randomNumber, end);
        int key = arr[end];
        int i = start;

        for (int j = start; j < end; j++) {
            if (arr[j] <= key) {
                exchange(arr, i, j);
                i++;
            }
        }
        exchange(arr, i, end);
        return i;
    }

    private void exchange(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
