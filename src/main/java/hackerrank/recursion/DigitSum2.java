package hackerrank.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class DigitSum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String value = in.next();
        int k = in.nextInt();

        BigInteger bigInteger = new BigInteger(value);

        int output = (k*new BigInteger(value).remainder(new BigInteger("9")).intValue())%9;
        System.out.println(output == 0 ? 9:output);

    }

    public static String superDigit(String p) {
        if (p.length() == 1) return p;

        long sum = sumOfDigit(p);

        return superDigit(String.valueOf(sum));
    }

    private static long sumOfDigit(String p) {
        char[] chars = p.toCharArray();
        long sum = 0;
        for (char c : chars) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        return sum;
    }

    private static long sumOfDigit(BigInteger bigInteger) {
        if (bigInteger.mod(new BigInteger("10")).equals(bigInteger)) return bigInteger.longValue();

        long sum = bigInteger.mod(new BigInteger("10")).longValue();

        sum += sumOfDigit(bigInteger.divide(new BigInteger("10")));

        return sum;
    }
}
