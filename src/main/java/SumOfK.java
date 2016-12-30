import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfK
{
    public static void main(String[] args)
    {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        //        int n = SumOfK.chooseBestSum(163, 3, ts);
        //
        //        System.out.println(n);
        //
        //        ts = new ArrayList<>(Arrays.asList(50));
        // Integer m = SumOfK.chooseBestSum(163, 3, ts);

        //        System.out.println(m);

        ts = new ArrayList<>(Arrays.asList(91, 87, 85, 81, 74, 73, 73));
        //System.out.println(SumOfK.chooseBestSum(331, 5, ts));

        ts = new ArrayList<>(Arrays.asList(2333, 144, 132, 123, 123, 100, 89, 89, 76, 73, 68, 64, 56, 56, 50, 44, 34));
        System.out.println(SumOfK.chooseBestSum(230, 4, ts));
    }

    public static Integer chooseBestSum(int distance, int visit, List<Integer> ls)
    {
        if (ls.size() < visit) {
            return null;
        }

        Collections.sort(ls, Collections.reverseOrder());
        ls = ls.stream().filter(x -> x < distance).collect(Collectors.toList());
        String collect = ls.stream().map(x -> x.toString()).collect(Collectors.joining(", "));
        System.out.println(collect + " --- " + visit + "------" + distance);
        return chooseBestSum(distance, visit, ls, 0);
    }

    private static Integer chooseBestSum(int distance, int visit, List<Integer> ls, int startIndex)
    {
        if (startIndex + visit - 1 > ls.size()) {
            return null;
        }

        Integer n = chooseBest(distance, visit, ls, startIndex);
        if (n != null) {
            return n;
        }

        List<Integer> ls1 = new ArrayList<>();
        ls1.addAll(ls);

        int i = 0;
        while (i < visit - 1 && ls.size() > startIndex + visit - 1 - i) {
            int index = startIndex + visit - 1 - i;
            int removed = ls1.remove(index);
            Integer v = chooseBest(distance, visit, ls1, startIndex);
            if (v != null) {
                return v;
            }
            ls1.add(index, removed);
            i++;
        }

        return chooseBestSum(distance, visit, ls, startIndex + 1);
    }

    private static Integer chooseBest(int distance, int visit, List<Integer> ls, int startIndex)
    {
        List<Integer> subList = ls.subList(startIndex, startIndex + visit - 1);

        int sum = subList.stream().mapToInt(x -> x).sum();

        int i = visit + startIndex - 1;
        while (i < ls.size()) {
            if (sum + ls.get(i) <= distance) {
                return sum + ls.get(i);
            }
            i++;
        }
        return null;
    }
}
