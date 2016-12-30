import java.util.ArrayList;
import java.util.List;

public class JohnAndAnn
{
    private static List<Long> john = new ArrayList<>();

    private static List<Long> ann = new ArrayList<>();

    public static void init()
    {
        if(john.size()==0 && ann.size() == 0) {
            john.add(0, 0L);
            ann.add(0, 1L);
        }
    }

    public static List<Long> john(long n)
    {
        init();
        for (int i = 0; i < n; i++) {
            johnCodeWar(i);
        }
        return john.subList(0, (int) n);
    }

    public static List<Long> ann(long n)
    {
        init();
        for (int i = 0; i < n; i++) {
            annCodeWar(i);
        }
        return ann.subList(0, (int) n);
    }

    private static void johnCodeWar(int n)
    {
        if (john.size() > n) {
            return;
        }

        if (n - 1 >= john.size()) {
            johnCodeWar(n - 1);
        }

        int codeWarByJohn = john.get(n - 1).intValue();

        if (codeWarByJohn >= ann.size()) {
            annCodeWar(codeWarByJohn);
        }

        long v = n - ann.get(codeWarByJohn);
        john.add(n, v);
    }

    private static void annCodeWar(int n)
    {
        if (ann.size() > n) {
            return;
        }

        if (n - 1 >= ann.size()) {
            annCodeWar(n - 1);
        }

        int codeWarByAnn = ann.get(n - 1).intValue();

        if (codeWarByAnn >= john.size()) {
            johnCodeWar(codeWarByAnn);
        }

        long v = n - john.get(codeWarByAnn);
        ann.add(n, v);
    }

    public static long sumJohn(long n)
    {
        init();
        return john((int) n).stream().mapToLong(x -> x).sum();
    }

    public static long sumAnn(long n)
    {
        init();
        return ann((int) n).stream().mapToLong(x -> x).sum();
    }

    public static void main(String[] args)
    {
        display(john(11));
        display(ann(6));

        System.out.println(sumAnn(115));
        System.out.println(sumJohn(75));
    }

    private static void display(List<Long> codeWars)
    {
        for (long j : codeWars) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
