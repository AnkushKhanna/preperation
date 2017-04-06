package hiredintech.list;

public class DigitSum
{
    public static int digit_sum(long number)
    {
        int sum = 0;
        number = Math.abs(number);

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }
}
