import java.util.List;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.*;

public class PrimeNumber
{
    public static List<Integer> findPrime(int i)
    {
        return IntStream.range(2, i + 1).filter(PrimeNumber::isPrime).boxed().collect(toList());
    }

    private static boolean isPrime(int i)
    {
        if (i == 2 || i == 3) {
            return true;
        }

        OptionalLong first = LongStream.range(2, (long) Math.sqrt(i) + 1).filter(v -> i % v == 0).findFirst();

        return !first.isPresent();
    }

    public static void main(String[] args)
    {
        System.out.println(findPrimeLong(50).stream().mapToLong(i -> i).count());
    }

    public static List<Long> findPrimeLong(long i)
    {
        return LongStream.range(2, i + 1).filter(PrimeNumber::isPrimeLong).boxed().collect(toList());
    }

    private static boolean isPrimeLong(long i)
    {
        if (i == 2 || i == 3) {
            return true;
        }

        OptionalLong first = LongStream.range(2, (long) Math.sqrt(i) + 1)
            .filter(v -> i % v == 0)
            .findFirst();

        return !first.isPresent();
    }
}
