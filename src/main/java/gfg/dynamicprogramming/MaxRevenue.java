package gfg.dynamicprogramming;

public class MaxRevenue
{
    public static int maxR(int[] x, int[] revenue)
    {
        int[] totalRevenue = new int[revenue.length];

        totalRevenue[0] = revenue[0];
        int maxRevenue = totalRevenue[0];

        for (int i = 1; i < x.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (x[i] - x[j] > 5) {
                    if (totalRevenue[i] < totalRevenue[j] + revenue[i]) {
                        totalRevenue[i] = totalRevenue[j] + revenue[i];
                    }
                }
            }
            maxRevenue = Math.max(maxRevenue, totalRevenue[i]);
        }

        return maxRevenue;
    }
}
