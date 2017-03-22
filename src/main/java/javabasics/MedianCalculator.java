package javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedianCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int a_i = 0; a_i < n; a_i++) {

            addToList(in.nextInt(), list);

            System.out.println(String.format("%.1f", findMedian(list)));
        }
    }

    private static float findMedian(final List<Integer> list)
    {
        if (list.size() == 1) {
            return list.get(0);
        }
        int mid = list.size() / 2;
        if (list.size() % 2 != 0) {
            return list.get(mid);
        } else {
            return (list.get(mid) + list.get(mid - 1)) / 2f;
        }
    }

    private static void addToList(final int value, List<Integer> list)
    {
        int index = findIndex(value, list, 0, list.size() - 1);
        list.add(index, value);
    }

    private static int findIndex(final int value, List<Integer> list, int start, int end)
    {

        if (list.size() == 0) {
            return 0;
        }

        if (start >= end) {
            return list.get(start) > value ? start : start+1;
        }

        int mid = (end + start) / 2;

        if (list.get(mid) == value) {
            return mid;
        }

        if (list.get(mid) > value) {
            return findIndex(value, list, start, mid - 1);
        }

        return findIndex(value, list, mid + 1, end);
    }
}
