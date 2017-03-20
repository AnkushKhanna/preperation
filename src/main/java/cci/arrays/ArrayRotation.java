package cci.arrays;

public class ArrayRotation
{
    public int[] rotate(int n, int[] a, int k) {
        int rotated[] = new int[n];
        int store[]= new int[k];

        System.arraycopy(a, 0, store, 0, k);

        System.arraycopy(a, k, rotated, 0, n-k);
        System.arraycopy(store, 0, rotated, n-k, k);

        return rotated;
    }
}
