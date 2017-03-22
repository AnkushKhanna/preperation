package cci.recursion_dynamic;

import java.util.Scanner;

public class Staircase
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();
            System.out.println(calculateWays(n, new int[n+1]));
        }
    }

    private static int calculateWays(final int stairs, int[] ways)
    {
        if (stairs == 0) {
            return 1;
        }
        if (stairs < 0) {
            return 0;
        }

        if (ways[stairs] == 0) {
            ways[stairs] = calculateWays(stairs - 1, ways) + calculateWays(stairs - 2, ways) + calculateWays(stairs - 3, ways);
        }
        return ways[stairs];
    }
}
