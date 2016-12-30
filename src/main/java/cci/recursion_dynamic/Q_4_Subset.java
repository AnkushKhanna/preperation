package cci.recursion_dynamic;

import java.util.ArrayList;

public class Q_4_Subset
{
    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index)
    {

        ArrayList<ArrayList<Integer>> allSubsets;

        if (set.size() == index) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
        } else {
            allSubsets = getSubsets(set, index + 1);

            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moresubSets = new ArrayList<>();

            for(ArrayList<Integer> subset : allSubsets) {
                ArrayList<Integer> newsubset = new ArrayList<>();
                newsubset.addAll(subset);
                newsubset.add(item);
                moresubSets.add(newsubset);
            }

            allSubsets.addAll(moresubSets);
        }
        return allSubsets;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(getSubsets(l, 0));
    }
}
