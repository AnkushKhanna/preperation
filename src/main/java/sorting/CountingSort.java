package sorting;

public class CountingSort
{
    public static void main(String[] args)
    {
        CountingSort s = new CountingSort();
        int[] sort = s.sort(new int[]{2, 5, 3, 0, 2, 3, 0, 3}, 5);
        for (int s1 : sort) {
            System.out.println(s1);
        }
    }

    public int[] sort(int[] A, int k)
    {
        int[] B = new int[A.length];
        return sort(A, B, k);
    }

    private int[] sort(int[] A, int[] B, int k)
    {
        int[] C = new int[k + 1];
        for (int i = 0; i < k+1; i++) {
            C[i] = 0;
        }

        for (int j = 0; j < A.length; j++) {
            C[A[j]] = C[A[j]] + 1;
        }

        for (int i = 1; i < k + 1; i++) {
            C[i] = C[i] + C[i - 1];
        }

        for (int j = A.length - 1; j >= 0; j--) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]] = C[A[j]] - 1;
        }

        return B;
    }
}
