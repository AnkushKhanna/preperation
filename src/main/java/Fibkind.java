import java.util.HashMap;
import java.util.Map;

public class Fibkind
{
    private static Map<Long, Long> fibKind = new HashMap<>();

    private static void init()
    {
        fibKind.put(1L, 1L);
        fibKind.put(2L, 1L);
    }

    public static long lengthSupUK(int n, int k)
    {
        init();
        long count = 0;
        for (long i = 1; i <= n; i++) {
            createFib(i);
            if (fibKind.get(i) >= k) {
                count++;
            }
        }

        return count;
    }

    public static long comp(int n)
    {
        init();
        long count = 0;
        for (long i = 2; i <= n; i++) {
            createFib(i);
            if (fibKind.get(i) < fibKind.get(i - 1)) {
                count++;
            }
        }
        return count;
    }

    private static void createFib(Long n)
    {
        Long value = fibKind.get(n);
        if (value != null) {
            return;
        }

        value = fibKind.get(n - fibKind.get(n - 1)) + fibKind.get(n - fibKind.get(n - 2));
        fibKind.put(n, value);
    }
}
