public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("middle"));
    }

    public static String getMiddle(String word)
    {

        int l = word.length();

        if (l % 2 == 0) {
            return word.substring(l / 2 - 1, l / 2 + 1);
        } else {
            return word.substring(l / 2, l / 2 + 1);
        }
    }
}
