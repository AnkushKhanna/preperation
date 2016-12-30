package cci.recursion_dynamic;

public class Q_1_TripleSteps_Memoization
{
    public static long ways(int s)
    {
        return ways(s, new long[s + 1]);
    }

    private static long ways(int s, long[] memo)
    {
        if (s < 0)
            return 0L;
        if (s == 0)
            return 1L;

        if (memo[s] == 0) {
            memo[s] = ways(s - 1, memo) + ways(s - 2, memo) + ways(s - 3, memo);
        }

        return memo[s];
    }

    public static void main(String[] args)
    {
        System.out.println(ways(3));
        System.out.println(ways(8));
        System.out.println(ways(150));
    }
}
