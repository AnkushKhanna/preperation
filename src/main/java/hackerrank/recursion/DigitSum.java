package hackerrank.recursion;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String value = in.next();
        int k = in.nextInt();
        String sum =  value;
        do {
            sum = String.valueOf(sumOfDigit(sum));
        }while (sum .length() != 1);

        int i = Integer.parseInt(sum);
        i*=k;

        System.out.println(superDigit(String.valueOf(i)));
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
}
