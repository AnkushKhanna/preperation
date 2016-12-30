public class Line
{
    public static void main(String[] args)
    {
        System.out.println(Line.Tickets(new int[]{25, 25, 50})); // => YES
        System.out.println(Line.Tickets(new int[]{25, 100}));
        System.out.println(Line.Tickets(new int[]{25, 25, 25, 50, 100}));
    }

    public static String Tickets(int[] peopleInLine)
    {
        Cashier.startFresh();
        for (int money : peopleInLine) {
            if (money == 25) {
                Cashier.dollor_25 += 1;
            } else if (money == 50) {
                Cashier.dollor_50 += 1;
                Cashier.dollor_25 -= 1;
            } else if (money == 100) {
                Cashier.dollor_100 += 1;
                if (Cashier.dollor_50 == 0) {
                    Cashier.dollor_25 -= 3;
                } else {
                    Cashier.dollor_50 -= 1;
                    Cashier.dollor_25 -= 1;
                }
            }

            if (Cashier.isNegative()) {
                return "NO";
            }
        }

        return "YES";
    }
}

class Cashier
{
    public static int dollor_25 = 0;

    public static int dollor_50 = 0;

    public static int dollor_100 = 0;

    public static boolean isNegative()
    {
        return (dollor_25 < 0) || (dollor_50 < 0);
    }

    public static void startFresh()
    {
        dollor_25 = dollor_50 = dollor_100 = 0;
    }
}
