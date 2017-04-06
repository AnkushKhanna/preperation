package cci.recursion_dynamic;

public class PrintPairs
{
    public static void main(String[] args)
    {
        printPairs("ALGO", 3);
        System.out.println("*****************");
        printPairs("ALGO", 2);
    }
    public static void printPairs(String str, int k)
    {
        printPairs(str.toCharArray(), k, 0);
    }

    private static void printPairs(char[] arr, int k, int index)
    {
        if (index == arr.length) {
            return;
        }

        for (int i = 0; i < arr.length - k + 2; i++) {
            System.out.print(arr[index]);
            for (int j = 0; j < k - 1; j++) {
                System.out.print(arr[i + j]);
            }
            System.out.print("  ");
        }

        System.out.println("");
        printPairs(arr, k, index + 1);
    }
}
