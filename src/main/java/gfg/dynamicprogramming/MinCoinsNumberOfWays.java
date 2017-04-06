package gfg.dynamicprogramming;

public class MinCoinsNumberOfWays
{
    public static int ways(int amount, int[] coins)
    {
        int[][] memory = new int[amount + 1][coins.length + 1];
        return ways(amount, coins, coins.length - 1, memory);
    }

    private static int ways(final int amount, final int[] coins, int index, final int[][] memory)
    {
        if (amount == 0) {
            return 1;
        }

        if (index < 0) {
            return 0;
        }

        if (amount < 0) {
            return 0;
        }

        if (memory[amount][index] != 0) {
            return memory[amount][index];
        }

        int ways = ways(amount - coins[index], coins, index, memory) +
            ways(amount, coins, index - 1, memory);

        memory[amount][index] = ways;

        return ways;
    }
}

class CC2
{
    public static void main(String[] args)
    {
        System.out.println(total(4, new int[]{1, 2, 3}, 0));
    }

    public static int total(int n, int[] v, int i)
    {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // means coins over and n>0 so no solution
        if (i == v.length && n > 0) {
            return 0;
        }
        return total(n - v[i], v, i) + total(n, v, i + 1);
    }
}
