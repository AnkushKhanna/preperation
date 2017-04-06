package gfg.dynamicprogramming;

public class ProductRowCutting
{
    public static int maxProduct(int n)
    {
        int[] memory = new int[n+1];

        return maxProduct(n, memory);
    }

    private static int maxProduct(int n, int[] memory)
    {
        if (n == 1 || n == 2) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, Math.max(i * (n - i), i * maxProduct(n - i, memory)));
        }

        memory[n] = max;

        return memory[n];
    }
}
