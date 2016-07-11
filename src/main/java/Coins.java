public class Coins
{
    public static int total(int n, int[] v, int i) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // means coins over and n>0 so no solution
        if (i == v.length && n > 0) {
            return 0;
        }
        return total(n - v[i], v, i) + total(n, v, i + 1);
    }

    public static int makeChange(int amount, int[] denoms) {
        return total(amount, denoms, 0);
    }

    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        int ways = makeChange(50, denoms);
        System.out.println(ways);
    }
}
