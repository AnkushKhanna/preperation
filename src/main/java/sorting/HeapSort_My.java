package sorting;

public class HeapSort_My
{
    public void heapSort(int[] arr)
    {
        buildMaxHeap(arr);
        int sizeOfHeap = arr.length;
        for (int i = arr.length - 1; i >= 1; i--) {
            exchange(arr, 0, i);
            sizeOfHeap--;
            maxHeapify(arr, 0, sizeOfHeap);
        }
    }

    private void buildMaxHeap(int[] arr)
    {
        int sizeOfHeap = arr.length;
        for (int i = arr.length / 2; i >= 0; i--) {
            maxHeapify(arr, i, sizeOfHeap);
        }
    }

    private int left(int i)
    {
        return (2 * i) + 1;
    }

    private int right(int i)
    {
        return (2 * i) + 2;
    }

    private void maxHeapify(int[] arr, int i, int sizeOfHeap)
    {
        int left = left(i);
        int right = right(i);

        int largest = i;

        if (left < sizeOfHeap && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < sizeOfHeap && arr[right] > arr[largest]) {
            largest = right;
        }

        if (i != largest) {
            exchange(arr, i, largest);
            maxHeapify(arr, largest, sizeOfHeap);
        }
    }

    private void exchange(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
