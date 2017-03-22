package cci.sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int money = in.nextInt();
            int n = in.nextInt();
            int prices[] = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                prices[a_i] = in.nextInt();
            }

            int sortedPrices[] = prices.clone();
            Arrays.sort(sortedPrices);

            int[] values = findPrices(sortedPrices, money);
            printIndex(values, prices);
        }
    }

    private static void printIndex(final int[] values, final int[] prices)
    {
        if (values == null) {
            return;
        }

        int index0 = 0, index1 = 0;

        for (int i = 0; i < prices.length; i++) {
            if (values[0] == prices[i] && index0 == 0) {
                index0 = i+1;
            } else if (values[1] == prices[i] && index1 == 0) {
                index1 = i+1;
            }
        }

        if (index0 < index1) {
            System.out.println(index0 + " " + index1);
        } else {
            System.out.println(index1 + " " + index0);
        }
    }

    private static int[] findPrices(final int[] prices, final int money)
    {
        for (int i = 0; i < prices.length; i++) {
            if (money > prices[i]) {
                int index = Arrays.binarySearch(prices, money - prices[i]);
                if (index > 0) {
                    return new int[]{prices[i], prices[index]};
                }
            }
        }
        return null;
    }
}
