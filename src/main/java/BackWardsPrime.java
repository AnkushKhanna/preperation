import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class BackWardsPrime
{
    public static String backwardsPrime(long start, long end)
    {
        return LongStream.range(start, end + 1).filter(BackWardsPrime::findBackwardPrime)
            .mapToObj(x -> ((Long) x).toString())
            .collect(Collectors.joining(" "));
    }

    private static boolean findBackwardPrime(long number)
    {
        if (number < 10) {
            return false;
        }

        long reverseNumber = getReverseInt(number);

        if (number == reverseNumber) {
            return false;
        }

        if (isPrime(number, reverseNumber)) {
            return true;
        }

        return false;
    }

    private static boolean isPrime(long number1, long number2)
    {

        if (number1 < number2) {
            return isPrime(number1) && isPrime(number2);
        } else {
            return isPrime(number2) && isPrime(number1);
        }
    }

    private static boolean isPrime(long number)
    {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long getReverseInt(long value)
    {
        long resultNumber = 0L;
        for (long i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }

    public static void main(String[] args)
    {
        System.out.println(BackWardsPrime.backwardsPrime(9900, 10000));
        System.out.println(BackWardsPrime.backwardsPrime(1, 100));

        System.out.println(isPrime(163));
    }
}
