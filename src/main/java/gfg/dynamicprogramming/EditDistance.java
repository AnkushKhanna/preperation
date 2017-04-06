package gfg.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class EditDistance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();

            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(edits(s1, s2));
        }
    }

    public static int edits(String s1, String s2)
    {
        int[][] memory = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                memory[i][j] = -1;
            }
        }

        return edits(s1, s2, s1.length(), s2.length(), memory);
    }

    private static int edits(String s1, String s2, int n, int m, int[][] memory)
    {
        if (n == 0) {
            return m;
        }

        if (m == 0) {
            return n;
        }


        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            if (memory[n - 1][m - 1] == -1) {
                int edit = edits(s1, s2, n - 1, m - 1, memory);
                memory[n - 1][m - 1] = edit;
            }
            return memory[n - 1][m - 1];
        } else {
            if (memory[n - 1][m - 1] == -1) {
                int edit = 1 + min(
                    edits(s1, s2, n, m - 1, memory),
                    edits(s1, s2, n - 1, m, memory),
                    edits(s1, s2, n - 1, m - 1, memory)
                );
                memory[n-1][m-1] = edit;
            }
            return memory[n-1][m-1];
        }
    }

    private static int min(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}

class EDIST
{
    static int min(int x,int y,int z)
    {
        if (x < y && x <z) return x;
        if (y < x && y < z) return y;
        else return z;
    }

    static int editDistDP(String str1, String str2, int m, int n)
    {
        // Create a table to store results of subproblems
        int dp[][] = new int[m+1][n+1];

        // Fill d[][] in bottom up manner
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                // If first string is empty, only option is to
                // isnert all characters of second string
                if (i==0)
                    dp[i][j] = j;  // Min. operations = j

                    // If second string is empty, only option is to
                    // remove all characters of second string
                else if (j==0)
                    dp[i][j] = i; // Min. operations = i

                    // If last characters are same, ignore last char
                    // and recur for remaining string
                else if (str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];

                    // If last character are different, consider all
                    // possibilities and find minimum
                else
                    dp[i][j] = 1 + min(dp[i][j-1],  // Insert
                                       dp[i-1][j],  // Remove
                                       dp[i-1][j-1]); // Replace
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m][n];
    }



    public static void main(String args[])
    {
        String str1 = "sunday";
        String str2 = "saturday";
        System.out.println( editDistDP( str1 , str2 , str1.length(), str2.length()) );
    }
}
