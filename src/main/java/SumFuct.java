import java.math.BigInteger;

public class SumFuct
{
    public static BigInteger perimeter(BigInteger n)
    {
        return fib(n).multiply(BigInteger.valueOf(4L));
    }

    private static BigInteger fib(BigInteger n)
    {
        BigInteger i = BigInteger.ONE;
        BigInteger j = BigInteger.ONE;
        BigInteger index = BigInteger.ONE;
        BigInteger k = BigInteger.valueOf(2L);
        while (index.compareTo(n) != 0) {
            BigInteger value = i.add(j);
            i = j;
            j = value;
            index = index.add(BigInteger.ONE);
            k = k.add(value);
        }
        return k;
    }

    public static void main(String[] args)
    {
        System.out.println(perimeter(BigInteger.valueOf(5L)));
        System.out.println(perimeter(BigInteger.valueOf(7L))); //216
        System.out.println(perimeter(BigInteger.valueOf(30L))); //14098308
    }
}
