package cci.recursion_dynamic;

public class Q_1_TripleSteps
{
    public static int ways(int s)
    {
        if (s < 0) return 0;

        if (s == 0) return 1;

        return ways(s - 1) + ways(s - 2) + ways(s - 3);
    }

    public static void main(String[] args)
    {
        System.out.println(ways(3));
        System.out.println(ways(8));
    }
}
