package gfg.dynamicprogramming;

import java.util.Scanner;

public class MinCoin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int amount = sc.nextInt();
            int[] coins = new int[n];
            for (int j = 0; j < n; j++) {
                coins[j] = sc.nextInt();
            }
            System.out.println(minCoins(amount, coins));
        }
    }

    public static int minCoins(int amount, int[] coins)
    {
        int[] memory = new int[amount + 1];
        return minCoins(amount, coins, memory);
    }

    private static int minCoins(final int amount, final int[] coins, final int[] memory)
    {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if (memory[amount] == 0) {
            int value = min(amount, coins, memory);
            if (value >= 0) {
                value++;
            }
            memory[amount] = value;
        }

        return memory[amount];
    }

    private static int min(int amount, int[] coins, int[] memory)
    {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int value = 0;
                if (memory[amount - coins[i]] == 0) {
                    value = minCoins(amount - coins[i], coins, memory);
                } else {
                    value = memory[amount - coins[i]];
                }
                if (value != -1) {
                    min = Math.min(min, value);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
