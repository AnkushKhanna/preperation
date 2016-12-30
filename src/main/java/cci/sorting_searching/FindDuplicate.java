package cci.sorting_searching;

import java.util.BitSet;

public class FindDuplicate
{
    public static void findDuplicate(int[] n)
    {
        BitSet bs = new BitSet(32000);

        for (int i : n) {
            i--;
            if (bs.get(i)) {
                System.out.println(i+1);
            }
            bs.set(i);
        }
    }

    public static void main(String[] args)
    {
        findDuplicate(new int[]{1,2,2,3,3,4,5,888,3,44444});
    }
}
