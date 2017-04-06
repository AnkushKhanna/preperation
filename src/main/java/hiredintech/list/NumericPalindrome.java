package hiredintech.list;

public class NumericPalindrome
{
    public static void main(String[] args)
    {
        int n = 666666;
        int length = (int) (Math.log10(n));
        System.out.println(n);
        double pow = Math.pow(10, length);
        System.out.println(pow);

        System.out.println(n % 10);
        System.out.println((int) n / pow);
    }

    public static boolean is_numeric_palindrome(long number)
    {
        if (number == 0) {
            return true;
        }

        int length = (int) Math.log10(number);

        if (length < 0) {
            return true;
        }

        double pow = Math.pow(10, length);
        int last = 10;
        int first = 1;

        while (pow >= last) {
            int start = (int) ((number / pow)% 10);
            int end = (int) ((number % last) / first);
            if (start != end) {
                return false;
            }
            last *= 10;
            first *= 10;
            pow /= 10;
        }
        return true;
    }
}
