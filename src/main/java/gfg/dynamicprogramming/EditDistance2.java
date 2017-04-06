package gfg.dynamicprogramming;

import java.util.Arrays;

public class EditDistance2
{
    public static int minEdits(String s1, String s2)
    {
        int[][] memory = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                if (i == 0) {
                    memory[i][j] = j;
                } else if (j == 0) {
                    memory[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    memory[i][j] = memory[i - 1][j - 1];
                } else {
                    memory[i][j] = min(memory[i][j - 1], memory[i - 1][j], memory[i - 1][j - 1])+1;
                }
            }
        }
        System.out.println(Arrays.deepToString(memory));
        return memory[s1.length()][s2.length()];
    }

    private static int min(final int i, final int i1, final int i2)
    {
        return Math.min(i, Math.min(i1, i2));
    }
}
